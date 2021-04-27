package com.example.demo.Model;

public class Theater {
	
	private String theaterId;
	private int hallNumber;
	private int rows;
	private int cols;
	private int totalSeats;
	
	public Theater(String theaterId, int hallNumber, int rows, int cols, int totalSeats) {
		super();
		this.theaterId = theaterId;
		this.hallNumber = hallNumber;
		this.rows = rows;
		this.cols = cols;
		this.totalSeats = totalSeats;
	}

	public String getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}

	public int getHallNumber() {
		return hallNumber;
	}

	public void setHallNumber(int hallNumber) {
		this.hallNumber = hallNumber;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	//Getter and Setter
	
	
}
