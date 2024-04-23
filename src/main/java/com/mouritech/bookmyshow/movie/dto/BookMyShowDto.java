package com.mouritech.bookmyshow.movie.dto;

import com.mouritech.bookmyshow.movie.model.Customer;

public class BookMyShowDto {
	
    private Integer movieId;
    private String movieName;
    private String time;
    private String cost;
    private Customer customer_id;
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
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
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Customer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Customer customer_id) {
		this.customer_id = customer_id;
	}
	public BookMyShowDto(Integer movieId, String movieName, String time, String cost, Customer customer_id) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.time = time;
		this.cost = cost;
		this.customer_id = customer_id;
	}
	public BookMyShowDto() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
 
	


}
