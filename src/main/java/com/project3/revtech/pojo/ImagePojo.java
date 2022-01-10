package com.project3.revtech.pojo;

public class ImagePojo {

    private int imageId;
    private String imageUrl;
    private int productId;

    public ImagePojo(int imageId, String imageUrl, int productId) {
        this.imageId = imageId;
        this.imageUrl = imageUrl;
        this.productId = productId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "ImagePojo{" +
                "imageId=" + imageId +
                ", imageUrl='" + imageUrl + '\'' +
                ", productId=" + productId +
                '}';
    }
}
