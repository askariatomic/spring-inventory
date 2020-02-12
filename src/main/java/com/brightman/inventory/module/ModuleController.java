package com.brightman.inventory.module;

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
@RequestMapping("module")
public class ModuleController {
    @Autowired
    private ModuleService moduleService;

    @GetMapping("/")
    public ResponseEntity<List<ModuleResult>> getAll() {
        List<ModuleResult> listModule = moduleService.getAllModule();

        return new ResponseEntity<List<ModuleResult>>(listModule, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModuleResult> getById(@PathVariable("id") int id) {
        ModuleResult moduleResult = moduleService.getModuleById(id);

        return new ResponseEntity<ModuleResult>(moduleResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ModuleResult> addModule(@RequestBody Module module) {
        moduleService.addModule(module);
        ModuleResult moduleResult = moduleService.getModuleById(moduleService.lastestInput());

        return new ResponseEntity<ModuleResult>(moduleResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModuleResult> updateModule(@PathVariable("id") int id, @RequestBody Module module) {
        moduleService.updateModule(module, id);
        ModuleResult moduleResult = moduleService.getModuleById(id);

        return new ResponseEntity<ModuleResult>(moduleResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ModuleResult> deleteModule(@PathVariable("id") int id) {
        ModuleResult moduleResult = moduleService.getModuleById(id);
        moduleService.deleteModule(id);

        return new ResponseEntity<ModuleResult>(moduleResult, HttpStatus.OK);
    }
}
