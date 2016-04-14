package com.techweaver.inbm.pojo;

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

import java.sql.Date;

public class Payment {

	private Integer id;
	private double amountPaid;
	private String paymentType;
	private Date paymentDate;
	private double amountBalance;
	private Date BalanceAmountPaymentDate;
	private String alertOnDate;
	private String chequeInvoiceNoteNumber;
	private String paymentSaleOrder;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChequeInvoiceNoteNumber() {
		return chequeInvoiceNoteNumber;
	}

	public void setChequeInvoiceNoteNumber(String chequeInvoiceNoteNumber) {
		this.chequeInvoiceNoteNumber = chequeInvoiceNoteNumber;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getAmountBalance() {
		return amountBalance;
	}

	public void setAmountBalance(double amountBalance) {
		this.amountBalance = amountBalance;
	}

	public Date getBalanceAmountPaymentDate() {
		return BalanceAmountPaymentDate;
	}

	public void setBalanceAmountPaymentDate(Date balanceAmountPaymentDate) {
		BalanceAmountPaymentDate = balanceAmountPaymentDate;
	}

	public String getAlertOnDate() {
		return alertOnDate;
	}

	public void setAlertOnDate(String alertOnDate) {
		this.alertOnDate = alertOnDate;
	}

	public String getchequeInvoiceNoteNumber() {
		return chequeInvoiceNoteNumber;
	}

	public void setchequeInvoiceNoteNumber(String chequeInvoiceNoteNumber) {
		this.chequeInvoiceNoteNumber = chequeInvoiceNoteNumber;
	}

	public String getPaymentSaleOrder() {
		return paymentSaleOrder;
	}

	public void setPaymentSaleOrder(String paymentSaleOrder) {
		this.paymentSaleOrder = paymentSaleOrder;
	}

}
