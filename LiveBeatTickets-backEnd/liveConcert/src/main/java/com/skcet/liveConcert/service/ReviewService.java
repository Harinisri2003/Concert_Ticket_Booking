package com.skcet.liveConcert.service;


import java.util.List;


import com.skcet.liveConcert.model.Review;

public interface ReviewService {
	public boolean addValue(Review review);
	 public List<Review> getValue();
}
