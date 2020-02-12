package com.brightman.inventory.category;

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
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public ResponseEntity<List<CategoryResult>> getAll() {
        List<CategoryResult> listCategory = categoryService.getAllCategory();

        return new ResponseEntity<List<CategoryResult>>(listCategory, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResult> getById(@PathVariable("id") int id) {
        CategoryResult categoryResult = categoryService.getCategoryById(id);

        return new ResponseEntity<CategoryResult>(categoryResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<CategoryResult> addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
        CategoryResult categoryResult = categoryService.getCategoryById(categoryService.lastestInput());

        return new ResponseEntity<CategoryResult>(categoryResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryResult> updateCategory(@PathVariable("id") int id, @RequestBody Category category) {
        categoryService.updateCategory(category, id);
        CategoryResult categoryResult = categoryService.getCategoryById(id);

        return new ResponseEntity<CategoryResult>(categoryResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CategoryResult> deleteCategory(@PathVariable("id") int id) {
        CategoryResult categoryResult = categoryService.getCategoryById(id);
        categoryService.deleteCategory(id);

        return new ResponseEntity<CategoryResult>(categoryResult, HttpStatus.OK);
    }
}
