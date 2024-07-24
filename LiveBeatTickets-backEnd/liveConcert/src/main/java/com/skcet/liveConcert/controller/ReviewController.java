package com.skcet.liveConcert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.skcet.liveConcert.model.Review;

import com.skcet.liveConcert.service.ReviewService;


@RestController
@RequestMapping("api/v1/review")
@CrossOrigin("*")
public class ReviewController {
	@Autowired
    private ReviewService reviewservice;
    
    @PostMapping("/add")
    public ResponseEntity<String> addValue(@RequestBody Review review)
    {
 	   boolean dataSaved = reviewservice.addValue(review);
 	   if(dataSaved) {
			return ResponseEntity.status(200).body("Value added successfully!");
		}else {
			return ResponseEntity.status(404).body("Something went wrong!");
		}
    }
    
    @GetMapping("/get")
   	public ResponseEntity<List<Review>> getValue(){
//    	   System.out.println("sop");
   		return ResponseEntity.status(200).body(reviewservice.getValue());
   	}
}
