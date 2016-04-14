package com.techweaver.inbm.controller;

/***************************************
 * Author: Naveed Khan                 *
 *Created Date: 31/12/2015		 	   *
 *Updated Date: 02/01/2016		       *
 *Description:			               *
 *				                       *
 *				                       *
 *				                       *
 *				                       *
 ***************************************/
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.techweaver.inbm.dao.impl.ProductDAOImpl;
import com.techweaver.inbm.pojo.Product;

@Controller
@RequestMapping("/product")
public class ProductController {
	// ClassPathXmlApplicationContext context = new
	// ClassPathXmlApplicationContext(
	// Constant.BEAN_XML);
	@Autowired
	ProductDAOImpl productImpl;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("msg", "Welcome TO INBM");
		return "inbm";
	}

	// ==============================================================================insertOrUpdateProdcut_Product
	@RequestMapping(value = "/insertProductUpdate", method = RequestMethod.GET)
	public ModelAndView insertOrUpdateProdcut() {
		// productImp.insertOrUpdateProduct();
		System.out.println("insertOrUpdateProdcut()");
		return new ModelAndView("inbm", "msg", "insertOrUpdateProdcut");

	}// insertOrUpdateProdcut_Product

	// ==============================================================================getAllProducts_Product
	
//	 @RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
//	 public ModelAndView getAllProducts() throws Exception {
//	 
//	 List<Product> products = productImpl.getAllProducts();// GET_ALL_PRODUCTS
//	 for (Product p : products) { System.out.println("====" +
//	 p.getProductId()); }// getAllProductsList_Product
//	 
//	 ModelAndView model = new ModelAndView("inbm"); model.addObject("msg",
//	 "SEE THE CONSOLE.. :)"); return model; }// getAllProducts_Product
//	

//	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
//	public @ResponseBody Map<String, Object> getAllProducts() {
//
//		List<Product> products = productImpl.getAllProducts();// GET_ALL_PRODUCTS
//		Map<String, String> productList = new HashMap<String, String>();
//		for (Product p : products) {
//		
////			System.out.println("====" + p.getProductId());
//
//			productList.put(p.getProductName(), p.getProductDescription() + "|"
//					+ p.getUnitPrice() + "|" + p.getDiscount());
//
//		}// getAllProductsList_Product
//
//		return Collections.<String, Object> singletonMap("products",
//				productList);
//	}// getAllProducts
	
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public @ResponseBody List<Product> getAllProducts() {

		List<Product> products = productImpl.getAllProducts();// GET_ALL_PRODUCTS
	//	System.out.println(products);
		return products;
	}// getAllProducts
	
	

	// ==============================================================================getProductsBelowReorderLevel_Product
	@RequestMapping(value = "/getProductsBelowReorderLevel", method = RequestMethod.GET)
	public ModelAndView getProductsBelowReorderLevel() throws Exception {

		List<Product> products = productImpl.getProductsBelowReorderLevel();// getProductsBelowReorderLevel
		for (Product p : products) {
			System.out.println("====" + p.getProductId());
			System.out.println("====" + p.getProductName());
		}// for

		ModelAndView model = new ModelAndView("inbm");
		model.addObject("msg", "SEE THE CONSOLE.. :)");
		return model;
	}// getProductsBelowReorderLevel_Product

}// ProductController