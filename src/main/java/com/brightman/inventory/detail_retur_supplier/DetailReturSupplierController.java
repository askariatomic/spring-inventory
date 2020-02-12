package com.brightman.inventory.detail_retur_supplier;

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
@RequestMapping("detailReturSupplier")
public class DetailReturSupplierController {
    @Autowired
    private DetailReturSupplierService detailReturSupplierService;

    @GetMapping("/")
    public ResponseEntity<List<DetailReturSupplierResult>> getAll() {
        List<DetailReturSupplierResult> listDetailReturSupplier = detailReturSupplierService.getAllDetailReturSupplier();

        return new ResponseEntity<List<DetailReturSupplierResult>>(listDetailReturSupplier, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailReturSupplierResult> getById(@PathVariable("id") int id) {
        DetailReturSupplierResult detailReturSupplierResult = detailReturSupplierService.getDetailReturSupplierById(id);

        return new ResponseEntity<DetailReturSupplierResult>(detailReturSupplierResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DetailReturSupplierResult> addDetailReturSupplier(@RequestBody DetailReturSupplier detailReturSupplier) {
        detailReturSupplierService.addDetailReturSupplier(detailReturSupplier);
        DetailReturSupplierResult detailReturSupplierResult = detailReturSupplierService.getDetailReturSupplierById(detailReturSupplierService.lastestInput());

        return new ResponseEntity<DetailReturSupplierResult>(detailReturSupplierResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetailReturSupplierResult> updateDetailReturSupplier(@PathVariable("id") int id, @RequestBody DetailReturSupplier detailReturSupplier) {
        detailReturSupplierService.updateDetailReturSupplier(detailReturSupplier, id);
        DetailReturSupplierResult detailReturSupplierResult = detailReturSupplierService.getDetailReturSupplierById(id);

        return new ResponseEntity<DetailReturSupplierResult>(detailReturSupplierResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetailReturSupplierResult> deleteDetailReturSupplier(@PathVariable("id") int id) {
        DetailReturSupplierResult detailReturSupplierResult = detailReturSupplierService.getDetailReturSupplierById(id);
        detailReturSupplierService.deleteDetailReturSupplier(id);

        return new ResponseEntity<DetailReturSupplierResult>(detailReturSupplierResult, HttpStatus.OK);
    }
}
