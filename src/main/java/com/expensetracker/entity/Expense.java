package com.expensetracker.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(length = 50, nullable = false)
    String title;

    @Column(nullable = false)
    int amount;

    @Column(updatable = false)
    LocalDateTime addedDate;

    public Expense orElse(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orElse'");
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(double amount) {
        this.amount = (int) amount;
    }

}
