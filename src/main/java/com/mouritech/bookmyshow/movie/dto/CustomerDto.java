package com.mouritech.bookmyshow.movie.dto;

public class CustomerDto {
    private Integer customer_id;
    private String gender;
    private String seatSelection;
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
	public CustomerDto(Integer customer_id, String gender, String seatSelection) {
		super();
		this.customer_id = customer_id;
		this.gender = gender;
		this.seatSelection = seatSelection;
	}
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	 


}
