package com.expensetracker.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.expensetracker.entity.Expense;
import com.expensetracker.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> findAll() // Show All Expenses
    {
        return expenseRepository.findAll();
    }

    public Expense findById(int id) // Single Expense
    {
        return expenseRepository.findById(id).orElse(null);
    }

    public List<Expense> findByAmountGreaterThan(int amount) // Amount Greater Than
    {
        return expenseRepository.findByAmountGreaterThan(amount);
    }

    public List<Expense> findByAmountBetween(int min, int max) // Filter by Range
    {
        return expenseRepository.findByAmountBetween(min, max);
    }

    public List<Expense> findByTitle(String title) // Search by Title
    {
        return expenseRepository.findByTitle(title);
    }

    public Expense save(Expense expense) // Insert & Update
    {
        return expenseRepository.save(expense);
    }

    public void deleteById(int id) // Delete Expense
    {
        expenseRepository.deleteById(id);
    }
}
