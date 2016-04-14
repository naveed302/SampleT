package com.techweaver.inbm.dao.impl;

/***************************************
 * Author: NAveed Khan                 *
 *Created Date: 27/11/2015		 	   *
 *Updated Date: 30/11/2015		       *
 *Description:			               *
 *				                       *
 *				                       *
 *				                       *
 *				                       *
 ***************************************/

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techweaver.inbm.dao.PaymentDAO;
import com.techweaver.inbm.mappers.PaymentMapper;
import com.techweaver.inbm.pojo.Payment;

public class PaymentDAOImpl implements PaymentDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public Boolean insertOrUpdatePayment(Payment payment) {
		String SQL = "INSERT INTO payments (id, amount_paid,payment_type,payment_date,amount_balance,Balance_amount_payment_date,"
				+ "alert_on_date,cheque_invoicenote_number,payment_sale_order) VALUES"
				+ " (?, ?,?, ?,?, ?,?, ?,?)";

		int insertedCount = jdbcTemplateObject.update(
				SQL,
				new Object[] { payment.getId(), payment.getAmountPaid(),
						payment.getPaymentType(), payment.getPaymentDate(),
						payment.getAmountBalance(),
						payment.getBalanceAmountPaymentDate(),
						payment.getAlertOnDate(),
						payment.getchequeInvoiceNoteNumber(),
						payment.getPaymentSaleOrder() });

		System.out.println("Inserted Record = " + insertedCount);

		return null;
	}

	public Payment getPaymentByInvoiceNumberOrChequeNumber(
			String invoiceChequeNumber) {
		// TODO Auto-generated method stub

		String SQL = "SELECT * FROM payments WHERE cheque_invoicenote_number = ?";
		Payment payment = jdbcTemplateObject.queryForObject(SQL,
				new Object[] { invoiceChequeNumber }, new PaymentMapper());

		return payment;

	}

	public List<Payment> getAllPayments() {

		String SQL = "SELECT * FROM payments";
		List<Payment> payments = jdbcTemplateObject.query(SQL,
				new PaymentMapper());

		return payments;
	}

}
