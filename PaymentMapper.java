package com.techweaver.inbm.mappers;

/***************************************
 * Author: NAveed Khan                 *
 *Created Date: 18/11/2015		 	   *
 *Updated Date: 18/11/2015		       *
 *Description:			               *
 *				                       *
 *				                       *
 *				                       *
 *				                       *
 ***************************************/

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import com.techweaver.inbm.constant.Constant;
import com.techweaver.inbm.pojo.Payment;

public class PaymentMapper implements RowMapper<Payment> {

	public Payment mapRow(ResultSet rs, int rowNum) throws SQLException {

		// loading the bean configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext(
				Constant.BEAN_XML);
		// Getting the Product pojo bean object
		Payment payment = (Payment) context.getBean("payment");

		payment.setId(rs.getInt("id"));
		payment.setAmountPaid(rs.getDouble("amount_paid"));
		payment.setPaymentType(rs.getString("payment_type"));
		payment.setPaymentDate(rs.getDate("payment_date"));
		payment.setAmountBalance(rs.getDouble("amount_balance"));
		payment.setBalanceAmountPaymentDate(rs
				.getDate("balance_amount_payment_date"));
		payment.setAlertOnDate(rs.getString("alert_on_date"));
		payment.setchequeInvoiceNoteNumber(rs
				.getString("cheque_invoicenote_number"));
		payment.setPaymentSaleOrder(rs.getString("payment_sale_order"));

		return payment;

	}
}
