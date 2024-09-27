package com.tonilr.RestaurantApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonilr.RestaurantApp.Entities.Booking;
import com.tonilr.RestaurantApp.Exceptions.NotFoundException;
import com.tonilr.RestaurantApp.Repos.BookingRepo;

@Service
public class BookingServices {

	@Autowired
	private final BookingRepo bookingRepo;

	public BookingServices(BookingRepo bookingRepo) {
		this.bookingRepo = bookingRepo;
	}

	public Booking addBooking(Booking booking) {
		return bookingRepo.save(booking);
	}

	public List<Booking> findAllBookings() {
		return bookingRepo.findAll();
	}

	public Booking updateBooking(Booking booking) {
		return bookingRepo.save(booking);
	}

	public Booking findBookingById(Long id) {
		return bookingRepo.findById(id)
				.orElseThrow(() -> new NotFoundException("Booking by id " + id + " was not found"));

	}

	public void deleteBooking(Long id) {
		bookingRepo.deleteById(id);
	}
}
