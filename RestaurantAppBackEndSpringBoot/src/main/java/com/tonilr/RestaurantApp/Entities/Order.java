package com.tonilr.RestaurantApp.Entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
	
	@Id
    private String order_id;

    private LocalDateTime date;
	
    private OrderStatus status;
	
	private BigDecimal total;
	
	@DBRef
    private User user;
    
	@DBRef
    private Receipt receipt;

	 public String getId() {
	        return order_id;
	    }

	    public void setId(String order_id) {
	        this.order_id = order_id;
	    }

	    public LocalDateTime getDate() {
	        return date;
	    }

	    public void setDate(LocalDateTime date) {
	        this.date = date;
	    }

	    public OrderStatus getStatus() {
	        return status;
	    }

	    public void setStatus(OrderStatus status) {
	        this.status = status;
	    }
	    
		public BigDecimal getTotal() {
			return total;
		}

		public void setTotal(BigDecimal total) {
			this.total = total;
		}
		
	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }
	    
	    public Receipt getReceipt() {
	        return receipt;
	    }

	    public void setReceipt(Receipt receipt) {
	        this.receipt = receipt;
	    }
	

}
