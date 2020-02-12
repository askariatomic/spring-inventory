package com.brightman.inventory.transfer;

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
@RequestMapping("transfer")
public class TransferController {
    @Autowired
    private TransferService transferService;

    @GetMapping("/")
    public ResponseEntity<List<TransferResult>> getAll() {
        List<TransferResult> listTransfer = transferService.getAllTransfer();

        return new ResponseEntity<List<TransferResult>>(listTransfer, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransferResult> getById(@PathVariable("id") int id) {
        TransferResult transferResult = transferService.getTransferById(id);

        return new ResponseEntity<TransferResult>(transferResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<TransferResult> addTransfer(@RequestBody Transfer transfer) {
        transferService.addTransfer(transfer);
        TransferResult transferResult = transferService.getTransferById(transferService.lastestInput());

        return new ResponseEntity<TransferResult>(transferResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TransferResult> updateTransfer(@PathVariable("id") int id, @RequestBody Transfer transfer) {
        transferService.updateTransfer(transfer, id);
        TransferResult transferResult = transferService.getTransferById(id);

        return new ResponseEntity<TransferResult>(transferResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TransferResult> deleteTransfer(@PathVariable("id") int id) {
        TransferResult transferResult = transferService.getTransferById(id);
        transferService.deleteTransferById(id);

        return new ResponseEntity<TransferResult>(transferResult, HttpStatus.OK);
    }
}
