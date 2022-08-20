package com.ainspace.market.vo;

public class ProductVO {
	
	int productSeq;
	String productTitle;
	String productContent;
	String productAddress;
	String productImage;
	String productMem;
	int productChats;
	int productLike;
	String productTime;
	int productPrice;
	int productStock;
	
	public int getProductSeq() {
		return productSeq;
	}
	public void setProductSeq(int productSeq) {
		this.productSeq = productSeq;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public String getProductContent() {
		return productContent;
	}
	public void setProductContent(String productContent) {
		this.productContent = productContent;
	}
	public String getProductAddress() {
		return productAddress;
	}
	public void setProductAddress(String productAddress) {
		this.productAddress = productAddress;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public String getProductMem() {
		return productMem;
	}
	public void setProductMem(String productMem) {
		this.productMem = productMem;
	}
	public int getProductChats() {
		return productChats;
	}
	public void setProductChats(int productChats) {
		this.productChats = productChats;
	}
	public int getProductLike() {
		return productLike;
	}
	public void setProductLike(int productLike) {
		this.productLike = productLike;
	}
	public String getProductTime() {
		return productTime;
	}
	public void setProductTime(String productTime) {
		this.productTime = productTime;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductStock() {
		return productStock;
	}
	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	
	@Override
	public String toString() {
		return "ProductVO [productSeq=" + productSeq + ", productTitle=" + productTitle + ", productContent="
				+ productContent + ", productAddress=" + productAddress + ", productImage=" + productImage
				+ ", productMem=" + productMem + ", productChats=" + productChats + ", productLike=" + productLike
				+ ", productTime=" + productTime + ", productPrice=" + productPrice + ", productStock=" + productStock
				+ "]";
	}
	

}
