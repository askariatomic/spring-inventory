package com.brightman.inventory.customer;

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
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public ResponseEntity<List<CustomerResult>> getAllCustomer() {
        List<CustomerResult> listCustomer = customerService.getAllCustomer();

        return new ResponseEntity<List<CustomerResult>>(listCustomer, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<CustomerResult> getCustomerById(@PathVariable("id") int id) {
        CustomerResult customerResult = customerService.getCustomerById(id);

        return new ResponseEntity<CustomerResult>(customerResult, HttpStatus.OK);
    }
    
    @GetMapping("/{id}/pageNo/{pageNo}/pageSize/{pageSize}/sortBy/{sortBy}")
    public ResponseEntity<List<CustomerResult>> getCustomers(
            @PathVariable("id") int id, 
            @PathVariable("pageNo") int pageNo,
            @PathVariable("pageSize") int pageSize,
            @PathVariable("sortBy") String sortBy) {
        List<CustomerResult> listCustomer = customerService.getAllCustomer();

        return new ResponseEntity<List<CustomerResult>>(listCustomer, HttpStatus.OK);
    }  

    @PostMapping("/")
    public ResponseEntity<CustomerResult> addCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
        CustomerResult customerResult = customerService.getCustomerById(customerService.lastestInput());

        return new ResponseEntity<CustomerResult>(customerResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerResult> updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer) {
        customerService.updateCustomer(customer, id);
        CustomerResult customerResult = customerService.getCustomerById(id);

        return new ResponseEntity<CustomerResult>(customerResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomerResult> deleteCustomer(@PathVariable("id") int id) {
        CustomerResult customerResult = customerService.getCustomerById(id);
        customerService.deleteCustomer(id);

        return new ResponseEntity<CustomerResult>(customerResult, HttpStatus.OK);
    }
}

