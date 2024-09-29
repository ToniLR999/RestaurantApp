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

import com.tonilr.RestaurantApp.Entities.Booking;
import com.tonilr.RestaurantApp.Services.BookingServices;

@Controller
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private final BookingServices bookingService;
	
	public BookingController(BookingServices bookingService) {
		this.bookingService = bookingService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Booking>> getAllBookings() {
		List<Booking> bookings = bookingService.findAllBookings();
		return new ResponseEntity<>(bookings, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Booking> getBookingById(@PathVariable("id") String id) {
		Booking cart = bookingService.findBookingById(id);
		return new ResponseEntity<>(cart, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) {
		Booking newBooking = bookingService.addBooking(booking);
		return new ResponseEntity<>(newBooking, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Booking> updateBooking(@RequestBody Booking booking) {
		Booking updateBooking = bookingService.updateBooking(booking);
		return new ResponseEntity<>(updateBooking, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteBooking(@PathVariable("id") String id) {
		bookingService.deleteBooking(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
