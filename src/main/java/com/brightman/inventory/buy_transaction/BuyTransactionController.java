package com.brightman.inventory.buy_transaction;

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
@RequestMapping("buyTransaction")
public class BuyTransactionController {
    @Autowired
    private BuyTransactionService buyTransactionService;

    @GetMapping("/")
    public ResponseEntity<List<BuyTransactionResult>> getAll() {
        List<BuyTransactionResult> listBuyTransaction = buyTransactionService.getAllBuyTransaction();

        return new ResponseEntity<List<BuyTransactionResult>>(listBuyTransaction, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BuyTransactionResult> getById(@PathVariable("id") int id) {
        BuyTransactionResult buyTransactionResult = buyTransactionService.getBuyTransactionById(id);

        return new ResponseEntity<BuyTransactionResult>(buyTransactionResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<BuyTransactionResult> addBuyTransaction(@RequestBody BuyTransaction buyTransaction) {
        buyTransactionService.addBuyTransaction(buyTransaction);
        BuyTransactionResult buyTransactionResult = buyTransactionService.getBuyTransactionById(buyTransactionService.lastestInput());

        return new ResponseEntity<BuyTransactionResult>(buyTransactionResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BuyTransactionResult> updateBuyTransaction(@PathVariable("id") int id, @RequestBody BuyTransaction buyTransaction) {
        buyTransactionService.updateBuyTransaction(buyTransaction, id);
        BuyTransactionResult buyTransactionResult = buyTransactionService.getBuyTransactionById(id);

        return new ResponseEntity<BuyTransactionResult>(buyTransactionResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BuyTransactionResult> deleteBuyTransaction(@PathVariable("id") int id) {
        BuyTransactionResult buyTransactionResult = buyTransactionService.getBuyTransactionById(id);
        buyTransactionService.deleteBuyTransaction(id);

        return new ResponseEntity<BuyTransactionResult>(buyTransactionResult, HttpStatus.OK);
    }
}
