package com.tonilr.RestaurantApp.Entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "receipts")  // Definición de la colección
public class Receipt {
	
	@Id
    private String receipt_id;

    private LocalDateTime date;
	
    private BigDecimal total;
    
	private PaymentMethod paymentMethod;
	
	@DBRef
	private  Order order;

	
	 public String getId() {
	        return receipt_id;
	    }

	    public void setId(String receipt_id) {
	        this.receipt_id = receipt_id;
	    }

	    public LocalDateTime getDate() {
	        return date;
	    }

	    public void setDate(LocalDateTime date) {
	        this.date = date;
	    }
	    
		public BigDecimal getTotal() {
			return total;
		}

		public void setTotal(BigDecimal total) {
			this.total = total;
		}
		
		public PaymentMethod getPaymentMethod() {
			return paymentMethod;
		}

		public void setPaymentMethod(PaymentMethod paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		
	    public Order getOrder() {
	        return order;
	    }

	    public void setOrder(Order order) {
	        this.order = order;
	    }


}
