package com.project3.revtech.pojo;

import java.math.BigDecimal;

public class ProductPojo {

	private int productId;
	private String productSku;
	private String productName;
	private BigDecimal productCost;
	private String productCategory;
	private String productDescription;
	private int productQty;
	private String imageUrl;
	private boolean productRemoved;

	public ProductPojo(int productId, String productSku, String productName,
					   BigDecimal productCost, String productCategory, String productDescription,
					   int productQty, String imageUrl, boolean productRemoved) {
		this.productId = productId;
		this.productSku = productSku;
		this.productName = productName;
		this.productCost = productCost;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productQty = productQty;
		this.imageUrl = imageUrl;
		this.productRemoved = productRemoved;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductSku() {
		return productSku;
	}

	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductCost() {
		return productCost;
	}

	public void setProductCost(BigDecimal productCost) {
		this.productCost = productCost;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isProductRemoved() {
		return productRemoved;
	}

	public void setProductRemoved(boolean productRemoved) {
		this.productRemoved = productRemoved;
	}

	@Override
	public String toString() {
		return "ProductPojo{" +
				"productId=" + productId +
				", productSku='" + productSku + '\'' +
				", productName='" + productName + '\'' +
				", productCost=" + productCost +
				", productCategory='" + productCategory + '\'' +
				", productDescription='" + productDescription + '\'' +
				", productQty=" + productQty +
				", imageUrl='" + imageUrl + '\'' +
				", productRemoved=" + productRemoved +
				'}';
	}
}
