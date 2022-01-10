package com.project3.revtech.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
public class StorageService {
	@Value("${application.bucket.name}")
	private String bucketName;
	
	@Autowired
	private AmazonS3 s3Client;

	private Logger log;
	
	//Upload a file
	public String uploadFile(MultipartFile file) {
		File fileObj = convertMultiPartFiletoFile(file);
		String fileName=System.currentTimeMillis()+"_"+file.getOriginalFilename();
		s3Client.putObject(new PutObjectRequest(bucketName,fileName,fileObj ));
		
		fileObj.delete();
		String fileLink = s3Client.getUrl(bucketName, fileName).toString();
		return fileLink;
	}
	
	//Download a file
	public byte[] downloadFile(String fileName) {
		S3Object s3Object = s3Client.getObject(bucketName, fileName);
		S3ObjectInputStream inputStream = s3Object.getObjectContent();
		try {
		byte[] content = IOUtils.toByteArray(inputStream);
				return content;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//Deleting a file
	public String deleteFile(String fileName) {
		s3Client.deleteObject(bucketName, fileName);
		return fileName + " removed ...";
	}
	
	//Converting a file
	private File convertMultiPartFiletoFile(MultipartFile file) {
		File convertedFile = new File(file.getOriginalFilename());
		try (FileOutputStream fos = new FileOutputStream(convertedFile)) {
			fos.write(file.getBytes());
		} catch (IOException e) {
			log.error("Error converting multipartFile to file", e);
		}
		return convertedFile;
	}


}
