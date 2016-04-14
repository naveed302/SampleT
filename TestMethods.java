package com.techweaver.inbm.test;

/***************************************
 * Author: Naveed Khan                 *
 *Created Date: 15/11/2015		 	   *
 *Updated Date: 02/10/2016		       *
 *Description:			               *
 *				                       *
 *				                       *
 *				                       *
 *				                       *
 ***************************************/
import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techweaver.inbm.constant.Constant;
import com.techweaver.inbm.dao.impl.PaymentDAOImpl;
import com.techweaver.inbm.dao.impl.ProductDAOImpl;
import com.techweaver.inbm.pojo.Payment;
import com.techweaver.inbm.pojo.Product;

public class TestMethods {

	public static void main(String[] args) {

		// loading the bean configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext(
				Constant.BEAN_XML);
		// Getting the ProductDAOImpl bean object

		ProductDAOImpl productImpl = (ProductDAOImpl) context
				.getBean("productImpl");
		// Getting the Product pojo bean object
		Product product = (Product) context.getBean("product");

		// setting all properties

		product.setSku(Constant.QUANTITY_SKU);
		product.setVendorProductId("v1");
		product.setProductName("P10name");
		product.setProductDescription("p1 desc");
		product.setSupplierId("s1");
		product.setCategoryId("c");
		product.setQuantityPerUnit(1);
		product.setUnitPrice(1);
		product.setMsrp(1);
		product.setAvailableSize(40);
		product.setAvailableColors("black,blue");
		product.setSize(40);
		product.setColor("white");
		product.setDiscount(0);
		product.setUnitWeight(1);
		product.setUnitsInStock(1000);
		product.setUnitsOnOrder(500);
		product.setReorderLevel(150);
		product.setProductAvailable(Constant.YES_FLAG);
		product.setDiscountAvailable(Constant.NO_FLAG);
		product.setCurrentOrder(0);
		product.setPictureURL("Picture path");
		product.setRanking(10);
		product.setNote("Sample Notes");
		product.setSmsNotification(Constant.NO_FLAG);
		product.setIDSKU("IDSKU1");
		product.setProductExpiryDate(new java.sql.Date(new java.util.Date()
				.getTime()));
		product.setProductDeleted(Constant.NO_FLAG);
		product.setAlertExpiryDate(Constant.NO_FLAG);

		// productImpl.insertOrUpdateProduct(product);// =INSERT PRODUCT
		// productImpl.deleteProduct(4, Constant.YES_FLAG);// DELETE PRODUCT
		// productImpl.updateProduct_Name(4, "ABC");//UPDATE PRODUCT

		 List<Product> products =
		 productImpl.getAllProducts();//GET_ALL_PRODUCTS
		 for (Product p : products) {
		 System.out.println("====" + p.getProductId());
		 }// for
		// -------------------------------------------------------------------------------------

		// Product singleProducts = productImpl.getProductByProductId(3);//
		// GET_SINGLE_PRODUCT
		// System.out.println(singleProducts.getProductName());
		// System.out.println(singleProducts.getCurrentOrder());
		// System.out.println(singleProducts.getAvailableColors());
		// System.out.println(singleProducts.getCategoryId());
		// -------------------------------------------------------------------------

		// List<Product> products =
		// productImpl.getProductsBelowReorderLevel();//
		// getProductsBelowReorderLevel
		// for (Product p : products) {
		// System.out.println("====" + p.getProductId());
		// System.out.println("====" + p.getProductName());
		// }// for

		PaymentDAOImpl paymentImpl = (PaymentDAOImpl) context
				.getBean("paymentImpl");
		// Getting the Payment pojo bean object
		Payment payment = (Payment) context.getBean("payment");

		// setting all properties
		payment.setId(1);
		payment.setAmountPaid(300);
		payment.setPaymentType(Constant.CASH_PAYMENT);
		payment.setPaymentDate(new Date(new java.util.Date().getTime()));
		payment.setAmountBalance(150);
		payment.setBalanceAmountPaymentDate(new Date(new java.util.Date()
				.getTime()));
		payment.setAlertOnDate(Constant.YES_FLAG);
		payment.setchequeInvoiceNoteNumber("xyz1235");
		payment.setPaymentSaleOrder(Constant.PAYMENTFORSALE);
		// paymentImpl.insertOrUpdatePayment(payment);// INSERT PAYMENT

		// Payment singlePayment = paymentImpl
		// .getPaymentByInvoiceNumberOrChequeNumber("xyz1235");//
		// GET_SINGLE_PAYMENT
		// System.out.println(singlePayment.getId());
		// System.out.println(singlePayment.getPaymentDate());
		// System.out.println(singlePayment.getPaymentSaleOrder());
		// System.out.println(singlePayment.getBalanceAmountPaymentDate());

		// List <Payment> payments
		// =paymentImpl.getAllPayments();//GET_ALL_PAYMENTS
		// for (Payment p : payments) {
		// System.out.println("====" + p.getId());
		// }// for
	}// main()
}// TestMethods
