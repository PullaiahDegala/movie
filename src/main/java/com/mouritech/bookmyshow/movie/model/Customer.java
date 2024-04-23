package com.mouritech.bookmyshow.movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="customer")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="customer_id")
    private Integer customer_id;
    
    @Column(name ="gender",nullable=false)
    private String gender;
    
    @Column(name ="seat_selection",nullable=false)
    private String seatSelection;

//    // Correcting mappedBy attribute to point to the field in Bookmyshow entity
//    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
//    private Bookmyshow bookmyshow;

    // Getters and setters
    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSeatSelection() {
        return seatSelection;
    }

    public void setSeatSelection(String seatSelection) {
        this.seatSelection = seatSelection;
    }

    public Customer() {
        super();
    }

    public Customer(Integer customer_id, String gender, String seatSelection) {
        super();
        this.customer_id = customer_id;
        this.gender = gender;
        this.seatSelection = seatSelection;
    }
//
//    // Getter and setter for Bookmyshow association
//    public Bookmyshow getBookmyshow() {
//        return bookmyshow;
//    }

}



 