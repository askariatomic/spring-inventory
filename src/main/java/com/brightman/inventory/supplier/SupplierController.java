package com.brightman.inventory.supplier;

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
@RequestMapping("supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @GetMapping("/")
    public ResponseEntity<List<SupplierResult>> getAll() {
        List<SupplierResult> listSupplier = supplierService.getAllSupplier();

        return new ResponseEntity<List<SupplierResult>>(listSupplier, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplierResult> getById(@PathVariable("id") int id) {
        SupplierResult supplierResult = supplierService.getSupplierById(id);

        return new ResponseEntity<SupplierResult>(supplierResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<SupplierResult> addSupplier(@RequestBody Supplier supplier) {
        supplierService.addSupplier(supplier);
        SupplierResult supplierResult = supplierService.getSupplierById(supplierService.lastestInput());

        return new ResponseEntity<SupplierResult>(supplierResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupplierResult> updateSupplier(@PathVariable("id") int id, @RequestBody Supplier supplier) {
        supplierService.updateSupplier(supplier, id);
        SupplierResult supplierResult = supplierService.getSupplierById(id);

        return new ResponseEntity<SupplierResult>(supplierResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SupplierResult> deleteSupplier(@PathVariable("id") int id) {
        SupplierResult supplierResult = supplierService.getSupplierById(id);
        supplierService.deleteSupplierById(id);

        return new ResponseEntity<SupplierResult>(supplierResult, HttpStatus.OK);
    }
}
