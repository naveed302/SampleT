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
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//public class BackUp_ProductController extends MultiActionController {
//	// ==============================================================================insertOrUpdateProdcut_Product
//	public ModelAndView insertOrUpdateProdcut_Product(HttpServletRequest request,
//			HttpServletResponse response, ProductDAOImpl productImpl) throws Exception {
//
////		productImp.insertOrUpdateProduct();
//		
//		
//		return new ModelAndView("helloWorld", "msg", "insertOrUpdateProdcut");
//	}// insertOrUpdateProdcut_Product
//
//	// ==============================================================================getAllProducts_Product
//	public ModelAndView getAllProducts_Product(HttpServletRequest request,
//			HttpServletResponse response, ProductDAOImpl productImpl)
//			throws Exception {
//		List<Product> products = productImpl.getAllProducts();// GET_ALL_PRODUCTS
//		for (Product p : products) {
//			System.out.println("====" + p.getProductId());
//		}// getAllProductsList_Product
//
//		ModelAndView model = new ModelAndView("helloWorld");
//		model.addObject("msg", "SEE THE CONSOLE.. :)");
//		return model;
//	}// getAllProducts_Product
//		// ==============================================================================getProductsBelowReorderLevel_Product
//
//	public ModelAndView getProductsBelowReorderLevel_Product(
//			HttpServletRequest request, HttpServletResponse response,
//			ProductDAOImpl productImpl) throws Exception {
//
//		List<Product> products = productImpl.getProductsBelowReorderLevel();// getProductsBelowReorderLevel
//		for (Product p : products) {
//			System.out.println("====" + p.getProductId());
//			System.out.println("====" + p.getProductName());
//		}// for
//
//		ModelAndView model = new ModelAndView("helloWorld");
//		model.addObject("msg", "SEE THE CONSOLE.. :)");
//		return model;
//	}// getProductsBelowReorderLevel_Product
//
//}// ProductController
//
// @Controller
// public class ProductController {
//
// @RequestMapping(value = "/list", method = RequestMethod.GET)
// public ModelAndView getdata() {
//
// List<String> list = getList();
//
// //return back to index.jsp
// ModelAndView model = new ModelAndView("list");
// model.addObject("lists", list);
//
// return model;
//
// }
//
// private List<String> getList() {
//
// List<String> list = new ArrayList<String>();
// list.add("List A");
// list.add("List B");
// list.add("List C");
// list.add("List D");
// list.add("List 1");
// list.add("List 2");
// list.add("List 3");
//
// return list;
//
// }
//
// }

// @Controller
// @RequestMapping("/hello")
// public class ProductController {
//
// @RequestMapping(method = RequestMethod.GET)
// public String printHello(ModelMap model) {
// model.addAttribute("message", "Hello Spring MVC Framework!");
//
// return "hello";
// }
//
// }
