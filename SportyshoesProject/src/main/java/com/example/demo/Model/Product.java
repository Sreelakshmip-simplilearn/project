package com.example.demo.Model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productCode;
	
	private String productName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productCategory_fk")
	private ProductCategory productCategory;
	
	
	private int size;
	private BigDecimal price;
	
	private String image_Url;
	
	

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getImage_Url() {
		return image_Url;
	}

	public void setImage_Url(String image_Url) {
		this.image_Url = image_Url;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", productCategory="
				+ productCategory + ", size=" + size + ", price=" + price + ", image_Url=" + image_Url + "]";
	}

	public Product() {
		
	}

	public Product(Long productCode, String productName, ProductCategory productCategory, int size, BigDecimal price,
			String image_Url) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productCategory = productCategory;
		this.size = size;
		this.price = price;
		this.image_Url = image_Url;
	}
	
	
	

}

