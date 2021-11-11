package com.example.demo.dto;

public class SeatsDTO {
	
	private int restSeats;
	private int totalSeats;
	private int rows;
	private int cols;
	
	public SeatsDTO(int restSeats, int totalSeats, int rows, int cols) {
		super();
		this.restSeats = restSeats;
		this.totalSeats = totalSeats;
		this.rows = rows;
		this.cols = cols;
	}
	public int getRestSeats() {
		return restSeats;
	}
	public void setRestSeats(int restSeats) {
		this.restSeats = restSeats;
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
	
	

}
