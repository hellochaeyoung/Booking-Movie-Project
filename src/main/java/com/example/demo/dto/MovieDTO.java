package com.example.demo.dto;

import java.util.List;

public class MovieDTO {
	
	private String movieName;
	private int hallNumber;
	private int seatPrice;
	private int totalSeats;
	private int restSeats;
	private List<String> times;
	
	public MovieDTO(String movieName, int hallNumber, int seatPrice, int totalSeats, int restSeats,
			List<String> times) {
		super();
		this.movieName = movieName;
		this.hallNumber = hallNumber;
		this.seatPrice = seatPrice;
		this.totalSeats = totalSeats;
		this.restSeats = restSeats;
		this.times = times;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getHallNumber() {
		return hallNumber;
	}

	public void setHallNumber(int hallNumber) {
		this.hallNumber = hallNumber;
	}

	public int getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(int seatPrice) {
		this.seatPrice = seatPrice;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getRestSeats() {
		return restSeats;
	}

	public void setRestSeats(int restSeats) {
		this.restSeats = restSeats;
	}

	public List<String> getTimes() {
		return times;
	}

	public void setTimes(List<String> times) {
		this.times = times;
	}
	
	
	
	

}
