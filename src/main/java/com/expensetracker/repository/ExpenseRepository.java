package com.expensetracker.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.expensetracker.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
    List<Expense> findAll(); // Show All Expenses

    Expense findById(int id); // Single Expense

    List<Expense> findByAmountGreaterThan(int amount); // Amount Greater Than

    List<Expense> findByAmountBetween(int min, int max); // Filter by Range

    List<Expense> findByTitle(String title); // Search by Title

    Expense save(Expense expense); // Insert & Update

    void deleteById(int id); // Delete Expense

}
