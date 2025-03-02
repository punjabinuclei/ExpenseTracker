package com.expensetracker.service;

import java.util.List;

import com.expensetracker.entity.Expense;

public interface ExpenseService {
    List<Expense> findAll(); // Show All Expenses

    Expense findById(int id); // Single Expense

    List<Expense> findByAmountGreaterThan(int amount); // Amount Greater Than

    List<Expense> findByAmountBetween(int min, int max); // Filter by Range

    List<Expense> findByTitle(String title); // Search by Title

    Expense save(Expense expense); // Insert & Update

    void deleteById(int id); // Delete Expense

}
