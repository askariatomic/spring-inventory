package com.brightman.inventory.detail_retur_staff;

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
@RequestMapping("detailReturStaff")
public class DetailReturStaffController {
    @Autowired
    private DetailReturStaffService detailReturStaffService;

    @GetMapping("/")
    public ResponseEntity<List<DetailReturStaffResult>> getAll() {
        List<DetailReturStaffResult> listDetailReturStaff = detailReturStaffService.getAllDetailReturStaff();

        return new ResponseEntity<List<DetailReturStaffResult>>(listDetailReturStaff, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailReturStaffResult> getById(@PathVariable("id") int id) {
        DetailReturStaffResult detailReturStaffResult = detailReturStaffService.getDetailReturStaffById(id);

        return new ResponseEntity<DetailReturStaffResult>(detailReturStaffResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DetailReturStaffResult> addDetailReturStaff(@RequestBody DetailReturStaff detailReturStaff) {
        detailReturStaffService.addDetailReturStaff(detailReturStaff);
        DetailReturStaffResult detailReturStaffResult = detailReturStaffService.getDetailReturStaffById(detailReturStaffService.lastestInput());

        return new ResponseEntity<DetailReturStaffResult>(detailReturStaffResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetailReturStaffResult> updateDetailReturStaff(@PathVariable("id") int id, @RequestBody DetailReturStaff detailReturStaff) {
        detailReturStaffService.updateDetailReturStaff(detailReturStaff, id);
        DetailReturStaffResult detailReturStaffResult = detailReturStaffService.getDetailReturStaffById(id);

        return new ResponseEntity<DetailReturStaffResult>(detailReturStaffResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetailReturStaffResult> deleteDetailReturStaff(@PathVariable("id") int id) {
        DetailReturStaffResult detailReturStaffResult = detailReturStaffService.getDetailReturStaffById(id);
        detailReturStaffService.deleteDetailReturStaff(id);

        return new ResponseEntity<DetailReturStaffResult>(detailReturStaffResult, HttpStatus.OK);
    }
}
