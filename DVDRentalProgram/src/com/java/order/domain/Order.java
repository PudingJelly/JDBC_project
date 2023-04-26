package com.java.order.domain;
/*
 CREATE TABLE order_history (
    order_no NUMBER(5) PRIMARY KEY,
    user_number NUMBER(5) NOT NULL,
    serial_number NUMBER(5) NOT NULL,
    order_date DATE DEFAULT sysdate,
    return_date DATE DEFAULT sysdate + 3
);
 */

import java.time.LocalDateTime;

public class Order {

	private int orderNo;
	private int userNum;
	private int serialNumber;
	private LocalDateTime orederDate;
	private LocalDateTime returnDate;
	
	public Order() {}

	public Order(int orderNo, int userNum, int serialNumber, LocalDateTime orederDate, LocalDateTime returnDate) {
		super();
		this.orderNo = orderNo;
		this.userNum = userNum;
		this.serialNumber = serialNumber;
		this.orederDate = orederDate;
		this.returnDate = returnDate;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public LocalDateTime getOrederDate() {
		return orederDate;
	}

	public void setOrederDate(LocalDateTime orederDate) {
		this.orederDate = orederDate;
	}

	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}
	
	
}
