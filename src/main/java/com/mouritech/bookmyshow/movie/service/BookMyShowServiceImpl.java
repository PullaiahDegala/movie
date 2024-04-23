package com.mouritech.bookmyshow.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.bookmyshow.movie.dao.BookMyShowRepository;
import com.mouritech.bookmyshow.movie.model.Bookmyshow;

@Service
public class BookMyShowServiceImpl implements BookMyShowService {
    
    @Autowired
    private BookMyShowRepository bookMyShowRepository;
	 
	@Override
	public Bookmyshow saveBooking(Bookmyshow bookmyshow) {
        return bookMyShowRepository.save(bookmyshow);
	}
	

	
//	
//	@Override
//	public Bookmyshow updateData(Bookmyshow bookmyshow) {
//		
//		return bookMyShowRepository.save(bookmyshow);
//	}
}
