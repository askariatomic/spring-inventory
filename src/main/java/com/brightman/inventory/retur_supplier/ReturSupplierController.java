package com.brightman.inventory.retur_supplier;

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
@RequestMapping("returSupplier")
public class ReturSupplierController {
    @Autowired
    private ReturSupplierService returSupplierService;

    @GetMapping("/")
    public ResponseEntity<List<ReturSupplierResult>> getAll() {
        List<ReturSupplierResult> listReturSupplier = returSupplierService.getAllReturSupplier();

        return new ResponseEntity<List<ReturSupplierResult>>(listReturSupplier, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReturSupplierResult> getById(@PathVariable("id") int id) {
        ReturSupplierResult returSupplierResult = returSupplierService.getReturSupplierById(id);

        return new ResponseEntity<ReturSupplierResult>(returSupplierResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ReturSupplierResult> addReturSupplier(@RequestBody ReturSupplier returSupplier) {
        returSupplierService.addReturSupplier(returSupplier);
        ReturSupplierResult returSupplierResult = returSupplierService.getReturSupplierById(returSupplierService.lastestInput());

        return new ResponseEntity<ReturSupplierResult>(returSupplierResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReturSupplierResult> updateReturSupplier(@PathVariable("id") int id, @RequestBody ReturSupplier returSupplier) {
        returSupplierService.updateReturSupplier(returSupplier, id);
        ReturSupplierResult returSupplierResult = returSupplierService.getReturSupplierById(id);

        return new ResponseEntity<ReturSupplierResult>(returSupplierResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ReturSupplierResult> deleteReturSupplier(@PathVariable("id") int id) {
        ReturSupplierResult returSupplierResult = returSupplierService.getReturSupplierById(id);
        returSupplierService.deleteReturSupplier(id);

        return new ResponseEntity<ReturSupplierResult>(returSupplierResult, HttpStatus.OK);
    }
}
