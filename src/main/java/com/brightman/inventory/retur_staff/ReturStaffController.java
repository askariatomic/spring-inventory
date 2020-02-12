package com.brightman.inventory.retur_staff;

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
@RequestMapping("returStaff")
public class ReturStaffController {
    @Autowired
    private ReturStaffService returStaffService;

    @GetMapping("/")
    public ResponseEntity<List<ReturStaffResult>> getAll() {
        List<ReturStaffResult> listReturStaff = returStaffService.getAllReturStaff();

        return new ResponseEntity<List<ReturStaffResult>>(listReturStaff, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReturStaffResult> getById(@PathVariable("id") int id) {
        ReturStaffResult returStaffResult = returStaffService.getReturStaffById(id);

        return new ResponseEntity<ReturStaffResult>(returStaffResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ReturStaffResult> addReturStaff(@RequestBody ReturStaff returStaff) {
        returStaffService.addReturStaff(returStaff);
        ReturStaffResult returStaffResult = returStaffService.getReturStaffById(returStaffService.lastestInput());

        return new ResponseEntity<ReturStaffResult>(returStaffResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReturStaffResult> updateReturStaff(@PathVariable("id") int id, @RequestBody ReturStaff returStaff) {
        returStaffService.updateReturStaff(returStaff, id);
        ReturStaffResult returStaffResult = returStaffService.getReturStaffById(id);

        return new ResponseEntity<ReturStaffResult>(returStaffResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ReturStaffResult> deleteReturStaff(@PathVariable("id") int id) {
        ReturStaffResult returStaffResult = returStaffService.getReturStaffById(id);
        returStaffService.deleteReturStaff(id);

        return new ResponseEntity<ReturStaffResult>(returStaffResult, HttpStatus.OK);
    }
}
