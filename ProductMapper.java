package com.techweaver.inbm.mappers;

/***************************************
 * Author: NAveed Khan                 *
 *Created Date: 18/11/2015		 	   *
 *Updated Date: 01/01/2016		       *
 *Description:			               *
 *				                       *
 *				                       *
 *				                       *
 *				                       *
 ***************************************/

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.techweaver.inbm.pojo.Product;

public class ProductMapper implements RowMapper<Product> {
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

		Product product = new Product();

		product.setProductId(rs.getInt("product_id"));
		product.setSku(rs.getString("sku"));
		product.setVendorProductId(rs.getString("vendor_product_id"));
		product.setProductName(rs.getString("product_name"));
		product.setProductDescription(rs.getString("product_description"));
		product.setSupplierId(rs.getString("supplier_id"));
		product.setCategoryId(rs.getString("category_id"));
		product.setQuantityPerUnit(rs.getDouble("quantity_per_unit"));
		product.setUnitPrice(rs.getDouble("unit_price"));
		product.setMsrp(rs.getDouble("msrp"));
		product.setAvailableSize(rs.getDouble("available_size"));
		product.setAvailableColors(rs.getString("available_colors"));
		product.setSize(rs.getDouble("size"));
		product.setColor(rs.getString("color"));
		product.setDiscount(rs.getDouble("discount"));
		product.setUnitWeight(rs.getDouble("unitweight"));
		product.setUnitsInStock(rs.getDouble("units_in_stock"));
		product.setUnitsOnOrder(rs.getDouble("units_on_order"));
		product.setReorderLevel(rs.getDouble("reorder_level"));
		product.setProductAvailable(rs.getString("product_available"));
		product.setDiscountAvailable(rs.getString("discount_available"));
		product.setCurrentOrder(rs.getDouble("current_order"));
		product.setPictureURL(rs.getString("picture_url"));
		product.setRanking(rs.getInt("ranking"));
		product.setNote(rs.getString("note"));
		product.setSmsNotification(rs.getString("sms_notification"));
		product.setIDSKU(rs.getString("IDSKU"));

		return product;

	}
}