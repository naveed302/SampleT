package com.techweaver.inbm.dao;

/***************************************
 * Author: NAveed Khan                 *
 *Created Date: 27/11/2015		 	   *
 *Updated Date: 27/11/2015		       *
 *Description:			               *
 *				                       *
 *				                       *
 *				                       *
 *				                       *
 ***************************************/

import java.util.List;

import com.techweaver.inbm.pojo.Payment;

public interface PaymentDAO {

	Boolean insertOrUpdatePayment(Payment payment);

	Payment getPaymentByInvoiceNumberOrChequeNumber(String invoiceChequeNumber);

	List<Payment> getAllPayments();

}// PaymentDAO
