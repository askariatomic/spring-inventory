package com.brightman.inventory.brand;

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
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("/")
    public ResponseEntity<List<BrandResult>> getAll() {
        List<BrandResult> listBrand = brandService.getAllBrand();

        return new ResponseEntity<List<BrandResult>>(listBrand, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BrandResult> getById(@PathVariable("id") int id) {
        BrandResult brandResult = brandService.getBrandById(id);

        return new ResponseEntity<BrandResult>(brandResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<BrandResult> addBrand(@RequestBody Brand brand) {
        brandService.addBrand(brand);
        BrandResult brandResult = brandService.getBrandById(brandService.lastestInput());

        return new ResponseEntity<BrandResult>(brandResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BrandResult> updateBrand(@PathVariable("id") int id, @RequestBody Brand brand) {
        brandService.updateBrand(brand, id);
        BrandResult brandResult = brandService.getBrandById(id);

        return new ResponseEntity<BrandResult>(brandResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BrandResult> deleteBrand(@PathVariable("id") int id) {
        BrandResult brandResult = brandService.getBrandById(id);
        brandService.deleteBrand(id);

        return new ResponseEntity<BrandResult>(brandResult, HttpStatus.OK);
    }
}
