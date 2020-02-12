package com.brightman.inventory.detail_so;

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
@RequestMapping("detailSO")
public class DetailSOController {
    @Autowired
    private DetailSOService detailSOService;

    @GetMapping("/")
    public ResponseEntity<List<DetailSOResult>> getAll() {
        List<DetailSOResult> listDetailSO = detailSOService.getAllDetailSO();

        return new ResponseEntity<List<DetailSOResult>>(listDetailSO, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailSOResult> getById(@PathVariable("id") int id) {
        DetailSOResult detailSOResult = detailSOService.getDetailSOById(id);

        return new ResponseEntity<DetailSOResult>(detailSOResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DetailSOResult> addDetailSO(@RequestBody DetailSO detailSO) {
        detailSOService.addDetailSO(detailSO);
        DetailSOResult detailSOResult = detailSOService.getDetailSOById(detailSOService.lastestInput());

        return new ResponseEntity<DetailSOResult>(detailSOResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetailSOResult> updateDetailSO(@PathVariable("id") int id, @RequestBody DetailSO detailSO) {
        detailSOService.updateDetailSO(detailSO, id);
        DetailSOResult detailSOResult = detailSOService.getDetailSOById(id);

        return new ResponseEntity<DetailSOResult>(detailSOResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetailSOResult> deleteDetailSO(@PathVariable("id") int id) {
        DetailSOResult detailSOResult = detailSOService.getDetailSOById(id);
        detailSOService.deleteDetailSO(id);

        return new ResponseEntity<DetailSOResult>(detailSOResult, HttpStatus.OK);
    }
}
