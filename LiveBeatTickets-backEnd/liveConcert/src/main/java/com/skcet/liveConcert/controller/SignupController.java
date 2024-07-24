package com.skcet.liveConcert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.liveConcert.model.Audience;
import com.skcet.liveConcert.model.Singup;
import com.skcet.liveConcert.service.ConcertService;
import com.skcet.liveConcert.service.SignupService;


@RestController
@CrossOrigin("*") 
@RequestMapping("api/v1/signup")
public class SignupController {
	@Autowired
    private SignupService signupService;
    
    @PostMapping("/add")
    public ResponseEntity<String> addValue(@RequestBody Singup signup)
    {
 	   boolean dataSaved = signupService.addValues(signup);
 	   if(dataSaved) {
			return ResponseEntity.status(200).body("Value added successfully!");
		}else {
			return ResponseEntity.status(404).body("Something went wrong!");
		}
    }
//	@Autowired
//    private ConcertService concertService;
//    
////    @Tag(name="register",description = "register endpoint")
//    @PostMapping("/add")
//    public ResponseEntity<String> addValue(@RequestBody Audience audience)
//    {
// 	   boolean dataSaved = concertService.addValue(audience);
// 	   if(dataSaved) {
//			return ResponseEntity.status(200).body("Value added successfully!");
//		}else {
//			return ResponseEntity.status(404).body("Something went wrong!");
//		}
//    }
}
