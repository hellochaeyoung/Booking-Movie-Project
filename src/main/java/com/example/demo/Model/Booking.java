package com.example.demo.Model;

public class Booking {
	
	private int customerId;
	private String phoneNumber;
	private String movieName;
	private String time;
	private int people;
	private String seatNumber;
	private int prices;
	private int hallNumber;
	
	public Booking(int customerId, String phoneNumber,String movieName, String time, int people, String seatNumber, int prices,
			int hallNumber) {
		super();
		this.customerId = customerId;
		this.phoneNumber = phoneNumber;
		this.movieName = movieName;
		this.time = time;
		this.people = people;
		this.seatNumber = seatNumber;
		this.prices = prices;
		this.hallNumber = hallNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getPrices() {
		return prices;
	}

	public void setPrices(int prices) {
		this.prices = prices;
	}

	public int getHallNumber() {
		return hallNumber;
	}

	public void setHallNumber(int hallNumber) {
		this.hallNumber = hallNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	//Getter and Setter

}
