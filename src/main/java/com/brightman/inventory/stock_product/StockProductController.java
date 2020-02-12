package com.brightman.inventory.stock_product;

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
@RequestMapping("stockProduct")
public class StockProductController {
    @Autowired
    private StockProductService stockProductService;

    @GetMapping("/")
    public ResponseEntity<List<StockProductResult>> getAll() {
        List<StockProductResult> listStockProduct = stockProductService.getAllStockProduct();

        return new ResponseEntity<List<StockProductResult>>(listStockProduct, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockProductResult> getById(@PathVariable("id") int id) {
        StockProductResult stockProductResult = stockProductService.getStockProductById(id);

        return new ResponseEntity<StockProductResult>(stockProductResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<StockProductResult> addStockProduct(@RequestBody StockProduct stockProduct) {
        stockProductService.addStockProduct(stockProduct);
        StockProductResult stockProductResult = stockProductService.getStockProductById(stockProductService.lastestInput());

        return new ResponseEntity<StockProductResult>(stockProductResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StockProductResult> updateStockProduct(@PathVariable("id") int id, @RequestBody StockProduct stockProduct) {
        stockProductService.updateStockProduct(stockProduct, id);
        StockProductResult stockProductResult = stockProductService.getStockProductById(id);

        return new ResponseEntity<StockProductResult>(stockProductResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<StockProductResult> deleteStockProduct(@PathVariable("id") int id) {
        StockProductResult stockProductResult = stockProductService.getStockProductById(id);
        stockProductService.deleteStockProductById(id);

        return new ResponseEntity<StockProductResult>(stockProductResult, HttpStatus.OK);
    }
}
