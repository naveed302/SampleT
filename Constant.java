package com.techweaver.inbm.constant;

/***************************************
 * Author: Naveed Khan                 *
 *Created Date: 22/11/2015		 	   *
 *Updated Date: 03/01/2016		       *
 *Description:			               *
 *				                       *
 *				                       *
 *				                       *
 *				                       *
 ***************************************/
import java.util.*;

public class Constant {

	//
	// Labels
	//
	public static final String INBM_TITLE = "TechWeaverINBM";
	public static final String INBM_INVOICE = "INVOICE_123";
	public static final String INBM_DASHBOARD = "DASHBOARD_123";
	//
	// CONFIGURATION FILE NAMES
	//
	public static final String BEAN_XML = "INBM-servlet.xml";
	//
	// URLS
	//
	public static final String ALL_PRODUCTS_URL = "http://localhost:8080/INBM/product/getAllProducts";
	public static final String ALL_PRODUCTS_BELOW_REORDER_LEVEL_URL = "http://localhost:8080/INBM/product/getProductsBelowReorderLevel";
	public static final String INSERT_OR_UPDATE_PRODUCT_URL = "http://localhost:8080/INBM/product/insertProductUpdate";
	

	//
	// Flags
	//
	public static final String YES_FLAG = "Y";
	public static final String NO_FLAG = "N";
	//
	// SKU
	//
	public static final String LITRE_SKU = "LTR";
	public static final String QUANTITY_SKU = "QTY";
	public static final String KILOGRAM_SKU = "KG";
	//
	// PAYMENT FOR OPTION
	//
	public static final String PAYMENTFORORDER = "ORDER";
	public static final String PAYMENTFORSALE = "SALE";
	//
	// PAYMENT TYPE
	//
	public static final String CASH_PAYMENT = "CASH";
	public static final String CHEQUE_PAYMENT = "CHEQUE";
	public static final String DEMAND_DRAFT_PAYMENT = "DEMAND_DRAFT";

}// CONSTANTS