package com.tonilr.RestaurantApp.Entities;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

import com.tonilr.CarsEcommerce.Entities.Cart;
import com.tonilr.CarsEcommerce.Entities.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
    private Long order_id;

	@Column(nullable = false, updatable = true)
    private LocalDateTime date;
	
    @Enumerated(EnumType.STRING)
	@Column(nullable = true, updatable = true)
    private OrderStatus status;
	
	@Column(nullable = false, updatable = true)
	private BigDecimal total;
	
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Receipt receipt;

	 public Long getId() {
	        return order_id;
	    }

	    public void setId(Long order_id) {
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
