package com.zwigato.zwigato.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Restaurent")
public class Restaurent {
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_name", nullable = false)
    private String orderName;

    @Column(name = "order_price")
    private int orderPrice;

    @Column(name = "restaurent_name")
    private String restaurentName;

    @Column(name = "rating")
    private int rating;

    // Create a constructor for the Restaurent class
    public Restaurent(String orderName, int orderPrice, String restaurentName, int rating) {
        this.orderName = orderName;
        this.orderPrice = orderPrice;
        this.restaurentName = restaurentName;
        this.rating = rating;
    }

    public Restaurent() {
        //TODO Auto-generated constructor stub
    }

    // Create getters and setters for the Restaurent class
    public String getOrderName() {
        return orderName;
    }
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    public int getOrderPrice() {
        return orderPrice;
    }
    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }
    public String getRestaurentName() {
        return restaurentName;
    }
    public void setRestaurentName(String restaurentName) {
        this.restaurentName = restaurentName;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }


}
