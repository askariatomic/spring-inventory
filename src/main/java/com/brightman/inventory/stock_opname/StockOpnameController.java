package com.brightman.inventory.stock_opname;

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
@RequestMapping("stockOpname")
public class StockOpnameController {
    @Autowired
    private StockOpnameService stockOpnameService;

    @GetMapping("/")
    public ResponseEntity<List<StockOpnameResult>> getAll() {
        List<StockOpnameResult> listStockOpname = stockOpnameService.getAllStockOpname();

        return new ResponseEntity<List<StockOpnameResult>>(listStockOpname, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockOpnameResult> getById(@PathVariable("id") int id) {
        StockOpnameResult stockOpnameResult = stockOpnameService.getStockOpnameById(id);

        return new ResponseEntity<StockOpnameResult>(stockOpnameResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<StockOpnameResult> addStockOpname(@RequestBody StockOpname stockOpname) {
        stockOpnameService.addStockOpname(stockOpname);
        StockOpnameResult stockOpnameResult = stockOpnameService.getStockOpnameById(stockOpnameService.lastestInput());

        return new ResponseEntity<StockOpnameResult>(stockOpnameResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StockOpnameResult> updateStockOpname(@PathVariable("id") int id, @RequestBody StockOpname stockOpname) {
        stockOpnameService.updateStockOpname(stockOpname, id);
        StockOpnameResult stockOpnameResult = stockOpnameService.getStockOpnameById(id);

        return new ResponseEntity<StockOpnameResult>(stockOpnameResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<StockOpnameResult> deleteStockOpname(@PathVariable("id") int id) {
        StockOpnameResult stockOpnameResult = stockOpnameService.getStockOpnameById(id);
        stockOpnameService.deleteStockOpnameById(id);

        return new ResponseEntity<StockOpnameResult>(stockOpnameResult, HttpStatus.OK);
    }
}

