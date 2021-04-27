package com.example.demo.Model;

import lombok.Data;

//hall_number, time, seat_price, total_seats, rest_seats
@Data
public class Movie {
	
	private String movieName;
	private String movieId;
	private int hallNumber;
	private int seatPrice;
	
	
	public Movie(String movieName, String movieId, int hallNumber, int seatPrice) {
		super();
		this.movieName = movieName;
		this.movieId = movieId;
		this.hallNumber = hallNumber;
		this.seatPrice = seatPrice;
		
	}
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
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
	
	
	
	
	
	//Getter and Setter 만들기!!
	

}
