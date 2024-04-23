package com.mouritech.bookmyshow.movie.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name ="movie_show")
public class Bookmyshow {
    
    @Id
    @Column(name ="movie_id")
    private Integer movieId;
    
    @Column(name ="movie_name",nullable=false)
    private String movieName;
    
    @Column(name ="time",nullable=false)
    private String time;
    
    @Column(name ="cost",nullable=false)
    private String cost;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Getters and setters

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Bookmyshow(Integer movieId, String movieName, String time, String cost, Customer customer) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.time = time;
		this.cost = cost;
		this.customer = customer;
	}

	public Bookmyshow() {
		super();
		// TODO Auto-generated constructor stub
	}

	




     
}
