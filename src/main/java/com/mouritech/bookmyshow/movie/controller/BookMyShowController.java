package com.mouritech.bookmyshow.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.bookmyshow.movie.model.Bookmyshow;
import com.mouritech.bookmyshow.movie.service.BookMyShowService;

@RestController
public class BookMyShowController {
    
    @Autowired
    private BookMyShowService bookMyShowService;
    
    @PostMapping("/bookings")
    public ResponseEntity<Bookmyshow> createBooking(@RequestBody Bookmyshow bookmyshow) {
        Bookmyshow savedBooking = bookMyShowService.saveBooking(bookmyshow);
        return new ResponseEntity<>(savedBooking, HttpStatus.CREATED);
    }
    
//    @PutMapping("/updated")
//    public ResponseEntity<?> updateData(@RequestBody Bookmyshow bookmyshow)
//    {
//    	Bookmyshow response =bookMyShowService.updateData(bookmyshow);
//    	return new ResponseEntity<>(response,HttpStatus.OK);
//    }
}
