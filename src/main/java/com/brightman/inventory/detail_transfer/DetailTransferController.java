package com.brightman.inventory.detail_transfer;

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
@RequestMapping("detailTransfer")
public class DetailTransferController {
    @Autowired
    private DetailTransferService detailTransferService;

    @GetMapping("/")
    public ResponseEntity<List<DetailTransferResult>> getAll() {
        List<DetailTransferResult> listDetailTransfer = detailTransferService.getAllDetailTransfer();

        return new ResponseEntity<List<DetailTransferResult>>(listDetailTransfer, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailTransferResult> getById(@PathVariable("id") int id) {
        DetailTransferResult detailTransferResult = detailTransferService.getDetailTransferById(id);

        return new ResponseEntity<DetailTransferResult>(detailTransferResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DetailTransferResult> addDetailTransfer(@RequestBody DetailTransfer detailTransfer) {
        detailTransferService.addDetailTransfer(detailTransfer);
        DetailTransferResult detailTransferResult = detailTransferService.getDetailTransferById(detailTransferService.lastestInput());

        return new ResponseEntity<DetailTransferResult>(detailTransferResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetailTransferResult> updateDetailTransfer(@PathVariable("id") int id, @RequestBody DetailTransfer detailTransfer) {
        detailTransferService.updateDetailTransfer(detailTransfer, id);
        DetailTransferResult detailTransferResult = detailTransferService.getDetailTransferById(id);

        return new ResponseEntity<DetailTransferResult>(detailTransferResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetailTransferResult> deleteDetailTransfer(@PathVariable("id") int id) {
        DetailTransferResult detailTransferResult = detailTransferService.getDetailTransferById(id);
        detailTransferService.deleteDetailTransfer(id);

        return new ResponseEntity<DetailTransferResult>(detailTransferResult, HttpStatus.OK);
    }
}
