package com.mouritech.bookmyshow.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.bookmyshow.movie.model.Bookmyshow;

@Repository
public interface BookMyShowRepository extends JpaRepository<Bookmyshow,Integer>{

}
