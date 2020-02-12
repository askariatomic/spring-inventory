package com.brightman.inventory.sales_order;

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
@RequestMapping("salesOrder")
public class SalesOrderController {
    @Autowired
    private SalesOrderService salesOrderService;

    @GetMapping("/")
    public ResponseEntity<List<SalesOrderResult>> getAll() {
        List<SalesOrderResult> listSalesOrder = salesOrderService.getAllSalesOrder();

        return new ResponseEntity<List<SalesOrderResult>>(listSalesOrder, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalesOrderResult> getById(@PathVariable("id") int id) {
        SalesOrderResult salesOrderResult = salesOrderService.getSalesOrderById(id);

        return new ResponseEntity<SalesOrderResult>(salesOrderResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<SalesOrderResult> addSalesOrder(@RequestBody SalesOrder salesOrder) {
        salesOrderService.addSalesOrder(salesOrder);
        SalesOrderResult salesOrderResult = salesOrderService.getSalesOrderById(salesOrderService.lastestInput());

        return new ResponseEntity<SalesOrderResult>(salesOrderResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalesOrderResult> updateSalesOrder(@PathVariable("id") int id, @RequestBody SalesOrder salesOrder) {
        salesOrderService.updateSalesOrder(salesOrder, id);
        SalesOrderResult salesOrderResult = salesOrderService.getSalesOrderById(id);

        return new ResponseEntity<SalesOrderResult>(salesOrderResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SalesOrderResult> deleteSalesOrder(@PathVariable("id") int id) {
        SalesOrderResult salesOrderResult = salesOrderService.getSalesOrderById(id);
        salesOrderService.deleteSalesOrder(id);

        return new ResponseEntity<SalesOrderResult>(salesOrderResult, HttpStatus.OK);
    }
}
