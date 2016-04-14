package com.techweaver.inbm.dao;

/***************************************
 * Author: NAveed Khan                 *
 *Created Date: 15/11/2015		 	   *
 *Updated Date: 02/01/2016		       *
 *Description:			               *
 *				                       *
 *				                       *
 *				                       *
 *				                       *
 ***************************************/
import java.util.List;

import com.techweaver.inbm.pojo.Product;

public interface ProductDAO {

	Boolean insertOrUpdateProduct(Product product);

	Boolean deleteProduct(Integer productId, String productDeleted);

	Boolean updateProduct_Name(Integer productId, String productName);

	Product getProductByProductId(Integer productId);

	List<Product> getAllProducts();

	List<Product> getProductsBelowReorderLevel();

}
