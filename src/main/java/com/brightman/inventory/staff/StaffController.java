package com.brightman.inventory.staff;

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
@RequestMapping("staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @GetMapping("/")
    public ResponseEntity<List<StaffResult>> getAll() {
        List<StaffResult> listStaff = staffService.getAllStaff();

        return new ResponseEntity<List<StaffResult>>(listStaff, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StaffResult> getById(@PathVariable("id") int id) {
        StaffResult staffResult = staffService.getStaffById(id);

        return new ResponseEntity<StaffResult>(staffResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<StaffResult> addStaff(@RequestBody Staff staff) {
        staffService.addStaff(staff);
        StaffResult staffResult = staffService.getStaffById(staffService.lastestInput());

        return new ResponseEntity<StaffResult>(staffResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StaffResult> updateStaff(@PathVariable("id") int id, @RequestBody Staff staff) {
        staffService.updateStaff(staff, id);
        StaffResult staffResult = staffService.getStaffById(id);

        return new ResponseEntity<StaffResult>(staffResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<StaffResult> deleteStaff(@PathVariable("id") int id) {
        StaffResult staffResult = staffService.getStaffById(id);
        staffService.deleteStaff(id);

        return new ResponseEntity<StaffResult>(staffResult, HttpStatus.OK);
    }
}
