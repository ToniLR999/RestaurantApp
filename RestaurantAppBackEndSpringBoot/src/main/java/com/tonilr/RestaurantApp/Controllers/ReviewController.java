package com.tonilr.RestaurantApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tonilr.RestaurantApp.Entities.Review;
import com.tonilr.RestaurantApp.Services.ReviewServices;

@Controller
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	private final ReviewServices reviewService;
	
	public ReviewController(ReviewServices reviewService) {
		this.reviewService = reviewService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Review>> getAllReviews() {
		List<Review> reviews = reviewService.findAllReviews();
		return new ResponseEntity<>(reviews, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Review> getReviewById(@PathVariable("id") Long id) {
		Review review = reviewService.findReviewById(id);
		return new ResponseEntity<>(review, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Review> addReview(@RequestBody Review review) {
		Review newReview = reviewService.addReview(review);
		return new ResponseEntity<>(newReview, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Review> updateReview(@RequestBody Review review) {
		Review updateReview = reviewService.updateReview(review);
		return new ResponseEntity<>(updateReview, HttpStatus.OK);
	}
	

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteReview(@PathVariable("id") Long id) {
		reviewService.deleteReview(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
