package com.brightman.inventory.product;

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
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public ResponseEntity<List<ProductResult>> getAll() {
        List<ProductResult> listProduct = productService.getAllProduct();

        return new ResponseEntity<List<ProductResult>>(listProduct, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResult> getById(@PathVariable("id") int id) {
        ProductResult productResult = productService.getProductById(id);

        return new ResponseEntity<ProductResult>(productResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ProductResult> addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        ProductResult productResult = productService.getProductById(productService.lastestInput());

        return new ResponseEntity<ProductResult>(productResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResult> updateProduct(@PathVariable("id") int id, @RequestBody Product product) {
        productService.updateProduct(product, id);
        ProductResult productResult = productService.getProductById(id);

        return new ResponseEntity<ProductResult>(productResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductResult> deleteProduct(@PathVariable("id") int id) {
        ProductResult productResult = productService.getProductById(id);
        productService.deleteProduct(id);

        return new ResponseEntity<ProductResult>(productResult, HttpStatus.OK);
    }
}
