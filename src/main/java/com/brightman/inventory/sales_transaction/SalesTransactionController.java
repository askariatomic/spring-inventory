package com.brightman.inventory.sales_transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("salesTransaction")
public class SalesTransactionController {
    @Autowired
    private SalesTransactionService salesTransactionService;

    @GetMapping("/")
    public ResponseEntity<List<SalesTransactionResult>> getAll() {
        List<SalesTransactionResult> listSalesTransaction = salesTransactionService.getAllSalesTransaction();

        return new ResponseEntity<List<SalesTransactionResult>>(listSalesTransaction, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalesTransactionResult> getById(@PathVariable("id") int id) {
        SalesTransactionResult salesTransactionResult = salesTransactionService.getSalesTransactionById(id);

        return new ResponseEntity<SalesTransactionResult>(salesTransactionResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<SalesTransactionResult> addSalesTransaction(@RequestBody SalesTransaction salesTransaction) {
        salesTransactionService.addSalesTransaction(salesTransaction);
        SalesTransactionResult salesTransactionResult = salesTransactionService.getSalesTransactionById(salesTransactionService.lastestInput());

        return new ResponseEntity<SalesTransactionResult>(salesTransactionResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalesTransactionResult> updateSalesTransaction(@PathVariable("id") int id, @RequestBody SalesTransaction salesTransaction) {
        salesTransactionService.updateSalesTransaction(salesTransaction, id);
        SalesTransactionResult salesTransactionResult = salesTransactionService.getSalesTransactionById(id);

        return new ResponseEntity<SalesTransactionResult>(salesTransactionResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SalesTransactionResult> deleteSalesTransaction(@PathVariable("id") int id) {
        SalesTransactionResult salesTransactionResult = salesTransactionService.getSalesTransactionById(id);
        salesTransactionService.deleteSalesTransaction(id);

        return new ResponseEntity<SalesTransactionResult>(salesTransactionResult, HttpStatus.OK);
    }
}
