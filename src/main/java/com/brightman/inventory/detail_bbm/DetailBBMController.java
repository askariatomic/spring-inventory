package com.brightman.inventory.detail_bbm;

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
@RequestMapping("detailBBM")
public class DetailBBMController {
    @Autowired
    private DetailBBMService detailBBMService;

    @GetMapping("/")
    public ResponseEntity<List<DetailBBMResult>> getAll() {
        List<DetailBBMResult> listDetailBBM = detailBBMService.getAllDetailBBM();

        return new ResponseEntity<List<DetailBBMResult>>(listDetailBBM, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailBBMResult> getById(@PathVariable("id") int id) {
        DetailBBMResult detailBBMResult = detailBBMService.getDetailBBMById(id);

        return new ResponseEntity<DetailBBMResult>(detailBBMResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DetailBBMResult> addDetailBBM(@RequestBody DetailBBM detailBBM) {
        detailBBMService.addDetailBBM(detailBBM);
        DetailBBMResult detailBBMResult = detailBBMService.getDetailBBMById(detailBBMService.lastestInput());

        return new ResponseEntity<DetailBBMResult>(detailBBMResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetailBBMResult> updateDetailBBM(@PathVariable("id") int id, @RequestBody DetailBBM detailBBM) {
        detailBBMService.updateDetailBBM(detailBBM, id);
        DetailBBMResult detailBBMResult = detailBBMService.getDetailBBMById(id);

        return new ResponseEntity<DetailBBMResult>(detailBBMResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetailBBMResult> deleteDetailBBM(@PathVariable("id") int id) {
        DetailBBMResult detailBBMResult = detailBBMService.getDetailBBMById(id);
        detailBBMService.deleteDetailBBM(id);

        return new ResponseEntity<DetailBBMResult>(detailBBMResult, HttpStatus.OK);
    }
}
