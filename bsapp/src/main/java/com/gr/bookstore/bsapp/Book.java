package com.gr.bookstore.bsapp;

public class Book {
	private String title;
	private double price;
	private String description;
	private String number;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(String title, double price, String description) {
		super();
		this.title = title;
		this.price = price;
		this.description = description;
	}



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
