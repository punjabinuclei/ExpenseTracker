package com.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.expensetracker.entity.Expense;
import com.expensetracker.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping
    public List<Expense> findAll() // Show All Expenses
    {
        return expenseRepository.findAll();
    }

}
