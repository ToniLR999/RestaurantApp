package com.tonilr.RestaurantApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonilr.RestaurantApp.Entities.Review;
import com.tonilr.RestaurantApp.Exceptions.NotFoundException;
import com.tonilr.RestaurantApp.Repos.ReviewRepo;

@Service
public class ReviewServices {

	@Autowired
	private final ReviewRepo reviewRepo;

	public ReviewServices(ReviewRepo reviewRepo) {
		this.reviewRepo = reviewRepo;
	}

	public Review addReview(Review review) {
		return reviewRepo.save(review);
	}

	public List<Review> findAllReviews() {
		return reviewRepo.findAll();
	}

	public Review updateReview(Review review) {
		return reviewRepo.save(review);
	}

	public Review findReviewById(String id) {
		return reviewRepo.findById(id)
				.orElseThrow(() -> new NotFoundException("Review by id " + id + " was not found"));
	}

	public void deleteReview(String id) {
		reviewRepo.deleteById(id);
	}
}
