package com.brightman.inventory.sales_payments;

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
@RequestMapping("salesPayment")
public class SalesPaymentController {
    @Autowired
    private SalesPaymentService salesPaymentService;

    @GetMapping("/")
    public ResponseEntity<List<SalesPaymentResult>> getAll() {
        List<SalesPaymentResult> listSalesPayment = salesPaymentService.getAllSalesPayment();

        return new ResponseEntity<List<SalesPaymentResult>>(listSalesPayment, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalesPaymentResult> getById(@PathVariable("id") int id) {
        SalesPaymentResult salesPaymentResult = salesPaymentService.getSalesPaymentById(id);

        return new ResponseEntity<SalesPaymentResult>(salesPaymentResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<SalesPaymentResult> addSalesPayment(@RequestBody SalesPayment salesPayment) {
        salesPaymentService.addSalesPayment(salesPayment);
        SalesPaymentResult salesPaymentResult = salesPaymentService.getSalesPaymentById(salesPaymentService.lastestInput());

        return new ResponseEntity<SalesPaymentResult>(salesPaymentResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalesPaymentResult> updateSalesPayment(@PathVariable("id") int id, @RequestBody SalesPayment salesPayment) {
        salesPaymentService.updateSalesPayment(salesPayment, id);
        SalesPaymentResult salesPaymentResult = salesPaymentService.getSalesPaymentById(id);

        return new ResponseEntity<SalesPaymentResult>(salesPaymentResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SalesPaymentResult> deleteSalesPayment(@PathVariable("id") int id) {
        SalesPaymentResult salesPaymentResult = salesPaymentService.getSalesPaymentById(id);
        salesPaymentService.deleteSalesPayment(id);

        return new ResponseEntity<SalesPaymentResult>(salesPaymentResult, HttpStatus.OK);
    }
}
