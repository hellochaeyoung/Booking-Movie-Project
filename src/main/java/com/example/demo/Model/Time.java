package com.example.demo.Model;

public class Time {
	
	private String timeId;
	private String time;
	private String movieId;
	private int restSeats;
	
	public Time(String timeId, String time, String movieId, int restSeats) {
		super();
		this.timeId = timeId;
		this.time = time;
		this.movieId = movieId;
		this.restSeats = restSeats;
	}

	public String getTimeId() {
		return timeId;
	}

	public void setTimeId(String timeId) {
		this.timeId = timeId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRestSeats() {
		return restSeats;
	}

	public void setRestSeats(int restSeats) {
		this.restSeats = restSeats;
	}
	
	//Getter and Setter
	

}
