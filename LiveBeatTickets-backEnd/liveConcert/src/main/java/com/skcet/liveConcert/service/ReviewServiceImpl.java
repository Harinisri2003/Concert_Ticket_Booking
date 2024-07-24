package com.skcet.liveConcert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.liveConcert.model.Review;
import com.skcet.liveConcert.repository.ReviewRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService{
 
	@Autowired
	private ReviewRepo reviewrepo;
	
	
	@Override
	public boolean addValue(Review review) {
		boolean eventIdExists= reviewrepo.existsById(review.getId());
		if(!eventIdExists)
		{
			reviewrepo.save(review);
			return true;
		}
		else
		return false;
	}


	@Override
	public List<Review> getValue() {
		// TODO Auto-generated method stub
		return reviewrepo.findAll();
	}

}
