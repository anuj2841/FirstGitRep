package com.anuj.crud.springboot.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "teciket_id")
	private Integer ticketId;
	
	@Column(name="passenger_name")
	private String passengerName;
	

	@Column(name="booking_date")
	private Date bookingDate;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name="email")
	private String email;
	
	@Column(name="source_destination")
	private String sourceDestination;
	
	public String getSourceDestination() {
		return sourceDestination;
	}

	public void setSourceDestination(String sourceDestination) {
		this.sourceDestination = sourceDestination;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
