package com.brightman.inventory.bbm;

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
@RequestMapping("bbm")
public class BBMController {
    @Autowired
    private BBMService bbmService;

    @GetMapping("/")
    public ResponseEntity<List<BBMResult>> getAll() {
        List<BBMResult> listBBM = bbmService.getAllBBM();

        return new ResponseEntity<List<BBMResult>>(listBBM, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BBMResult> getById(@PathVariable("id") int id) {
        BBMResult bBMResult = bbmService.getBBMById(id);

        return new ResponseEntity<BBMResult>(bBMResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<BBMResult> addBBM(@RequestBody BBM bBM) {
        bbmService.addBBM(bBM);
        BBMResult bBMResult = bbmService.getBBMById(bbmService.lastestInput());

        return new ResponseEntity<BBMResult>(bBMResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BBMResult> updateBBM(@PathVariable("id") int id, @RequestBody BBM bBM) {
        bbmService.updateBBM(bBM, id);
        BBMResult bBMResult = bbmService.getBBMById(id);

        return new ResponseEntity<BBMResult>(bBMResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BBMResult> deleteBBM(@PathVariable("id") int id) {
        BBMResult bBMResult = bbmService.getBBMById(id);
        bbmService.deleteBBM(id);

        return new ResponseEntity<BBMResult>(bBMResult, HttpStatus.OK);
    }
}
