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

import com.tonilr.RestaurantApp.Entities.Receipt;
import com.tonilr.RestaurantApp.Services.ReceiptServices;

@Controller
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/receipt")
public class ReceiptController {

	@Autowired
	private final ReceiptServices receiptService;
	
	public ReceiptController(ReceiptServices receiptService) {
		this.receiptService = receiptService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Receipt>> getAllReceipts() {
		List<Receipt> receipts = receiptService.findAllReceipts();
		return new ResponseEntity<>(receipts, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Receipt> getReceiptById(@PathVariable("id") Long id) {
		Receipt receipt = receiptService.findReceiptById(id);
		return new ResponseEntity<>(receipt, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Receipt> addAccount(@RequestBody Receipt cart) {
		Receipt newReceipt = receiptService.addReceipt(cart);
		return new ResponseEntity<>(newReceipt, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Receipt> updateReceipt(@RequestBody Receipt receipt) {
		Receipt updateReceipt = receiptService.updateReceipt(receipt);
		return new ResponseEntity<>(updateReceipt, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteReceipt(@PathVariable("id") Long id) {
		receiptService.deleteReceipt(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
