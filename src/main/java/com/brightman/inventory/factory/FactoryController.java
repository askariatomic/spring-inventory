package com.brightman.inventory.factory;

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
@RequestMapping("factory")
public class FactoryController {
    @Autowired
    private FactoryService factoryService;

    @GetMapping("/")
    public ResponseEntity<List<FactoryResult>> getAll() {
        List<FactoryResult> listFactory = factoryService.getAllFactory();

        return new ResponseEntity<List<FactoryResult>>(listFactory, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FactoryResult> getById(@PathVariable("id") int id) {
        FactoryResult factoryResult = factoryService.getFactoryById(id);

        return new ResponseEntity<FactoryResult>(factoryResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<FactoryResult> addFactory(@RequestBody Factory factory) {
        factoryService.addFactory(factory);
        FactoryResult factoryResult = factoryService.getFactoryById(factoryService.lastestInput());

        return new ResponseEntity<FactoryResult>(factoryResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FactoryResult> updateFactory(@PathVariable("id") int id, @RequestBody Factory factory) {
        factoryService.updateFactory(factory, id);
        FactoryResult factoryResult = factoryService.getFactoryById(id);

        return new ResponseEntity<FactoryResult>(factoryResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<FactoryResult> deleteFactory(@PathVariable("id") int id) {
        FactoryResult factoryResult = factoryService.getFactoryById(id);
        factoryService.deleteFactory(id);

        return new ResponseEntity<FactoryResult>(factoryResult, HttpStatus.OK);
    }
}
