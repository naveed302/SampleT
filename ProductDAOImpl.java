package com.techweaver.inbm.dao.impl;

/***************************************
 * Author: Naveed Khan                 *
 *Created Date: 15/11/2015		 	   *
 *Updated Date: 22/11/2015		       *
 *Description:			               *
 *				                       *
 *				                       *
 *				                       *
 *				                       *
 ***************************************/

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techweaver.inbm.constant.Constant;
import com.techweaver.inbm.dao.ProductDAO;
import com.techweaver.inbm.mappers.ProductMapper;
import com.techweaver.inbm.pojo.Product;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {

	private DataSource dataSource;
	JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	// ===================================================================INSERTING_PRODUCT
	public Boolean insertOrUpdateProduct(Product product) {

		String SQL = "INSERT INTO products (product_id, sku,vendor_product_id,product_name,product_description,supplier_id,"
				+ "category_id,quantity_per_unit,unit_price,msrp,available_size,available_colors,size,color,discount,"
				+ "unitweight,units_in_stock,units_on_order,reorder_level,product_available,"
				+ "discount_available,current_order,picture_url,ranking,note,sms_notification,IDSKU,product_expiry_date,product_deleted,alert_expiry_date) VALUES"
				+ " (?, ?,?, ?,?, ?,?, ?,?, ?,?, ?,?, ?,?,?, ?,?, ?,?, ?,?, ?,?, ?,?,?,?,?,?)";

		int insertedCount = jdbcTemplateObject.update(
				SQL,
				new Object[] { product.getProductId(), product.getSku(),
						product.getVendorProductId(), product.getProductName(),
						product.getProductDescription(),
						product.getSupplierId(), product.getCategoryId(),
						product.getQuantityPerUnit(), product.getUnitPrice(),
						product.getMsrp(), product.getAvailableSize(),
						product.getAvailableColors(), product.getSize(),
						product.getColor(), product.getDiscount(),
						product.getUnitWeight(), product.getUnitsInStock(),
						product.getUnitsOnOrder(), product.getReorderLevel(),
						product.getProductAvailable(),
						product.getDiscountAvailable(),
						product.getCurrentOrder(), product.getPictureURL(),
						product.getRanking(), product.getNote(),
						product.getSmsNotification(), product.getIDSKU(),
						product.getProductExpiryDate(),
						product.getProductDeleted(),
						product.getAlertExpiryDate() });

		System.out.println("Inserted Record = " + insertedCount);

		return false;
	}// saveOrUpdateProdcut

	// ==============================================================================DELETING_PRODUCT
	public Boolean deleteProduct(Integer productId, String productDeleted) {
		// String SQL = "DELETE FROM Products WHERE product_id = ?";

		String SQL = "UPDATE products SET product_deleted = ? WHERE product_id = ?";

		int deletedCount = jdbcTemplateObject.update(SQL, productDeleted,
				productId);

		System.out.println("Deleted Record with product_id = " + productId
				+ "   Count = " + deletedCount);

		return false;
	}// deleteProductproductDeleted

	// ==============================================================================UPDATING_PRODUCT_NAME
	public Boolean updateProduct_Name(Integer productId, String productName) {

		String SQL = "UPDATE products SET product_name = ? WHERE product_id = ?";
		int updatedCount = jdbcTemplateObject.update(SQL, productName,
				productId);

		System.out.println("Updated Record with product_id = " + productId
				+ "   Count = " + updatedCount);
		return false;
	}// updateProduct_Name
		// ==============================================================================GET_ALL_PRODUCT_DETAILS

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub

		String SQL = "SELECT * FROM products";
		List<Product> products = jdbcTemplateObject.query(SQL,
				new ProductMapper());

		return products;

	}// getAllProducts
		// ==============================================================================GET_PRODUCT_BY_PRODUCT_ID

	public Product getProductByProductId(Integer productId) {
		String SQL = "SELECT * FROM products WHERE product_id = ?";
		Product product = jdbcTemplateObject.queryForObject(SQL,
				new Object[] { productId }, new ProductMapper());

		return product;

	}// getProductByProductId

	// ==============================================================================GET_PRODUCT_BY_PRODUCT_ID

	public List<Product> getProductsBelowReorderLevel() {

		String SQL = "SELECT * FROM products WHERE units_in_stock <= reorder_level";
		List<Product> products = jdbcTemplateObject.query(SQL,
				new ProductMapper());

		return products;

	}// getProductsBelowReorderLevel

}// ProductDAOImpl
