package com.brightman.inventory.temp_detail_transfer;

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
@RequestMapping("tempDetailTransfer")
public class TempDetailTransferController {
    @Autowired
    private TempDetailTransferService tempDetailTransferService;

    @GetMapping("/")
    public ResponseEntity<List<TempDetailTransferResult>> getAll() {
        List<TempDetailTransferResult> listTempDetailTransfer = tempDetailTransferService.getAllTempDetailTransfer();

        return new ResponseEntity<List<TempDetailTransferResult>>(listTempDetailTransfer, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TempDetailTransferResult> getById(@PathVariable("id") int id) {
        TempDetailTransferResult tempDetailTransferResult = tempDetailTransferService.getTempDetailTransferById(id);

        return new ResponseEntity<TempDetailTransferResult>(tempDetailTransferResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<TempDetailTransferResult> addTempDetailTransfer(@RequestBody TempDetailTransfer tempDetailTransfer) {
        tempDetailTransferService.addTempDetailTransfer(tempDetailTransfer);
        TempDetailTransferResult tempDetailTransferResult = tempDetailTransferService.getTempDetailTransferById(tempDetailTransferService.lastestInput());

        return new ResponseEntity<TempDetailTransferResult>(tempDetailTransferResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TempDetailTransferResult> updateTempDetailTransfer(@PathVariable("id") int id, @RequestBody TempDetailTransfer tempDetailTransfer) {
        tempDetailTransferService.updateTempDetailTransfer(tempDetailTransfer, id);
        TempDetailTransferResult tempDetailTransferResult = tempDetailTransferService.getTempDetailTransferById(id);

        return new ResponseEntity<TempDetailTransferResult>(tempDetailTransferResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TempDetailTransferResult> deleteTempDetailTransfer(@PathVariable("id") int id) {
        TempDetailTransferResult tempDetailTransferResult = tempDetailTransferService.getTempDetailTransferById(id);
        tempDetailTransferService.deleteTempDetailTransferById(id);

        return new ResponseEntity<TempDetailTransferResult>(tempDetailTransferResult, HttpStatus.OK);
    }
}
