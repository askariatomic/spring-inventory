package com.brightman.inventory.debt;

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
@RequestMapping("debt")
public class DebtController {
    @Autowired
    private DebtService debtService;

    @GetMapping("/")
    public ResponseEntity<List<DebtResult>> getAll() {
        List<DebtResult> listDebt = debtService.getAllDebt();

        return new ResponseEntity<List<DebtResult>>(listDebt, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DebtResult> getById(@PathVariable("id") int id) {
        DebtResult debtResult = debtService.getDebtById(id);

        return new ResponseEntity<DebtResult>(debtResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DebtResult> addDebt(@RequestBody Debt debt) {
        debtService.addDebt(debt);
        DebtResult debtResult = debtService.getDebtById(debtService.lastestInput());

        return new ResponseEntity<DebtResult>(debtResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DebtResult> updateDebt(@PathVariable("id") int id, @RequestBody Debt debt) {
        debtService.updateDebt(debt, id);
        DebtResult debtResult = debtService.getDebtById(id);

        return new ResponseEntity<DebtResult>(debtResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DebtResult> deleteDebt(@PathVariable("id") int id) {
        DebtResult debtResult = debtService.getDebtById(id);
        debtService.deleteDebt(id);

        return new ResponseEntity<DebtResult>(debtResult, HttpStatus.OK);
    }
}

