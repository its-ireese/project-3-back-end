package com.project3.revtech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @Getter
// @Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "image_details")
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "image_id")
	private int imageId;
	
	@NotNull
	@Column(name = "image_url")
	private String imageUrl;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false)
	private Product product;

	@Column(name = "product_id")
	private int productId;

	public Image(int imageId, @NotNull String imageUrl, Product product, int productId) {
		super();
		this.imageId = imageId;
		this.imageUrl = imageUrl;
		this.product = product;
		this.productId = productId;
	}

	public Image(int imageId, String imageUrl, int productId) {
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
}
