package com.brightman.inventory.receivable;

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
@RequestMapping("receivable")
public class ReceivableController {
    @Autowired
    private ReceivableService receivableService;

    @GetMapping("/")
    public ResponseEntity<List<ReceivableResult>> getAll() {
        List<ReceivableResult> listReceivable = receivableService.getAllReceivable();

        return new ResponseEntity<List<ReceivableResult>>(listReceivable, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReceivableResult> getById(@PathVariable("id") int id) {
        ReceivableResult receivableResult = receivableService.getReceivableById(id);

        return new ResponseEntity<ReceivableResult>(receivableResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ReceivableResult> addReceivable(@RequestBody Receivable receivable) {
        receivableService.addReceivable(receivable);
        ReceivableResult receivableResult = receivableService.getReceivableById(receivableService.lastestInput());

        return new ResponseEntity<ReceivableResult>(receivableResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReceivableResult> updateReceivable(@PathVariable("id") int id, @RequestBody Receivable receivable) {
        receivableService.updateReceivable(receivable, id);
        ReceivableResult receivableResult = receivableService.getReceivableById(id);

        return new ResponseEntity<ReceivableResult>(receivableResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ReceivableResult> deleteReceivable(@PathVariable("id") int id) {
        ReceivableResult receivableResult = receivableService.getReceivableById(id);
        receivableService.deleteReceivable(id);

        return new ResponseEntity<ReceivableResult>(receivableResult, HttpStatus.OK);
    }
}
