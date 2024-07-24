package com.skcet.liveConcert.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="_payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       @Column(name="date_time")
       private String eventDateTime;
       private double amount;
       private String paymentstatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEventDateTime() {
		return eventDateTime;
	}
	public void setEventDateTime(String eventDateTime) {
		this.eventDateTime = eventDateTime;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPayment_status() {
		return paymentstatus;
	}
	public void setPayment_status(String payment_status) {
		this.paymentstatus = payment_status;
	}
	public Payment(Long id, String eventDateTime, double amount, String payment_status) {
		super();
		this.id = id;
		this.eventDateTime = eventDateTime;
		this.amount = amount;
		this.paymentstatus = payment_status;
	}
	public Payment() {
		super();
	}
	
}
