package com.tonilr.RestaurantApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonilr.RestaurantApp.Entities.Receipt;
import com.tonilr.RestaurantApp.Exceptions.NotFoundException;
import com.tonilr.RestaurantApp.Repos.ReceiptRepo;

@Service
public class ReceiptServices {

	@Autowired
	private final ReceiptRepo receiptRepo;

	public ReceiptServices(ReceiptRepo receiptRepo) {
		this.receiptRepo = receiptRepo;
	}

	public Receipt addReceipt(Receipt receipt) {
		return receiptRepo.save(receipt);
	}

	public List<Receipt> findAllReceipts() {
		return receiptRepo.findAll();
	}

	public Receipt updateReceipt(Receipt receipt) {
		return receiptRepo.save(receipt);
	}

	public Receipt findReceiptById(String id) {
		return receiptRepo.findById(id)
				.orElseThrow(() -> new NotFoundException("Receipt by id " + id + " was not found"));

	}

	public void deleteReceipt(String id) {
		receiptRepo.deleteById(id);
	}
}
