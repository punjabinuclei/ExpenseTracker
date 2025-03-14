package com.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.expensetracker.entity.Expense;
import com.expensetracker.repository.ExpenseRepository;
import com.expensetracker.service.ExpenseServiceImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    @Autowired
    private ExpenseServiceImpl expenseService;

    @PostMapping
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense) {
        Expense savedExpense = expenseService.save(expense);
        return ResponseEntity.ok(savedExpense);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Expense> updateExpense(@PathVariable int id, @RequestBody Expense expense) {
        Expense existingExpense = expenseRepository.findById(id);

        existingExpense.setTitle(expense.getTitle());
        existingExpense.setAmount(expense.getAmount());

        Expense savedExpense = expenseRepository.save(existingExpense);
        return ResponseEntity.ok(savedExpense);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Expense> deleteExpense(@PathVariable int id) {
        Expense existingExpense = expenseRepository.findById(id);
        expenseRepository.delete(existingExpense);
        return ResponseEntity.ok().build();
    }

}
