package com.brightman.inventory.buy_payment;

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
@RequestMapping("buypayment")
public class BuyPaymentController {
    @Autowired
    BuyPaymentService buypaymentService;

    @GetMapping("/")
    public ResponseEntity<List<BuyPaymentResult>> getAll() {
        List<BuyPaymentResult> listBuyPayment = buypaymentService.getAllBuyPayment();

        return new ResponseEntity<List<BuyPaymentResult>>(listBuyPayment, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BuyPaymentResult> getById(@PathVariable("id") int id) {
        BuyPaymentResult buypaymentResult = buypaymentService.getBuyPaymentById(id);

        return new ResponseEntity<BuyPaymentResult>(buypaymentResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<BuyPaymentResult> addBuyPayment(@RequestBody BuyPayment buypayment) {
        buypaymentService.addBuyPayment(buypayment);
        BuyPaymentResult buypaymentResult = buypaymentService.getBuyPaymentById(buypaymentService.lastestInput());

        return new ResponseEntity<BuyPaymentResult>(buypaymentResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BuyPaymentResult> updateBuyPayment(@PathVariable("id") int id, @RequestBody BuyPayment buypayment) {
        buypaymentService.updateBuyPayment(buypayment, id);
        BuyPaymentResult buypaymentResult = buypaymentService.getBuyPaymentById(id);

        return new ResponseEntity<BuyPaymentResult>(buypaymentResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BuyPaymentResult> deleteBuyPayment(@PathVariable("id") int id) {
        BuyPaymentResult buyaymentResult = buypaymentService.getBuyPaymentById(id);
        buypaymentService.deleteBuyPayment(id);

        return new ResponseEntity<BuyPaymentResult>(buyaymentResult, HttpStatus.OK);
    }
}
