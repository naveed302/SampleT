package com.techweaver.inbm.pojo;

import java.sql.Date;

public class Product {
	private Integer productId;
	private String sku;
	private String vendorProductId;
	private String productName;
	private String productDescription;
	private String supplierId;
	private String categoryId;
	private double quantityPerUnit = 0.0;
	private double unitPrice;
	private double msrp;
	private double availableSize;
	private String availableColors;
	private double size;
	private String color;
	private double discount;
	private double unitWeight;
	private double unitsInStock;
	private double unitsOnOrder;
	private double reorderLevel;
	private String productAvailable;
	private String discountAvailable;
	private double currentOrder;
	private String pictureURL;
	private int ranking;
	private String note;
	private String smsNotification;
	private String IDSKU;
	private Date productExpiryDate;
	private String productDeleted;
	private String alertExpiryDate;

	public String getAlertExpiryDate() {
		return alertExpiryDate;
	}

	public void setAlertExpiryDate(String alertExpiryDate) {
		this.alertExpiryDate = alertExpiryDate;
	}

	public Date getProductExpiryDate() {
		return productExpiryDate;
	}

	public void setProductExpiryDate(Date productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
	}

	public String getProductDeleted() {
		return productDeleted;
	}

	public void setProductDeleted(String productDeleted) {
		this.productDeleted = productDeleted;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getVendorProductId() {
		return vendorProductId;
	}

	public void setVendorProductId(String vendorProductId) {
		this.vendorProductId = vendorProductId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public double getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(double quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getMsrp() {
		return msrp;
	}

	public void setMsrp(double msrp) {
		this.msrp = msrp;
	}

	public double getAvailableSize() {
		return availableSize;
	}

	public void setAvailableSize(double availableSize) {
		this.availableSize = availableSize;
	}

	public String getAvailableColors() {
		return availableColors;
	}

	public void setAvailableColors(String availableColors) {
		this.availableColors = availableColors;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(double unitWeight) {
		this.unitWeight = unitWeight;
	}

	public double getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(double unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public double getUnitsOnOrder() {
		return unitsOnOrder;
	}

	public void setUnitsOnOrder(double unitsOnOrder) {
		this.unitsOnOrder = unitsOnOrder;
	}

	public double getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(double reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public String getProductAvailable() {
		return productAvailable;
	}

	public void setProductAvailable(String productAvailable) {
		this.productAvailable = productAvailable;
	}

	public String getDiscountAvailable() {
		return discountAvailable;
	}

	public void setDiscountAvailable(String discountAvailable) {
		this.discountAvailable = discountAvailable;
	}

	public double getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(double currentOrder) {
		this.currentOrder = currentOrder;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSmsNotification() {
		return smsNotification;
	}

	public void setSmsNotification(String smsNotification) {
		this.smsNotification = smsNotification;
	}

	public String getIDSKU() {
		return IDSKU;
	}

	public void setIDSKU(String iDSKU) {
		IDSKU = iDSKU;
	}

}
