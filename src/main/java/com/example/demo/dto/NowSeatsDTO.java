package com.example.demo.dto;

public class NowSeatsDTO {
	
	private int restSeats;
	private int totalSeats;
	
	public NowSeatsDTO(int restSeats, int totalSeats) {
		super();
		this.restSeats = restSeats;
		this.totalSeats = totalSeats;
	}

	public int getRestSeats() {
		return restSeats;
	}

	public void setRestSeats(int restSeats) {
		this.restSeats = restSeats;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	

}
