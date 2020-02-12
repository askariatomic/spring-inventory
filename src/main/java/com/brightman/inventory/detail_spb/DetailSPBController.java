package com.brightman.inventory.detail_spb;

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
@RequestMapping("detailSPB")
public class DetailSPBController {
    @Autowired
    private DetailSPBService detailSPBService;

    @GetMapping("/")
    public ResponseEntity<List<DetailSPBResult>> getAll() {
        List<DetailSPBResult> listDetailSPB = detailSPBService.getAllDetailSPB();

        return new ResponseEntity<List<DetailSPBResult>>(listDetailSPB, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailSPBResult> getById(@PathVariable("id") int id) {
        DetailSPBResult detailSPBResult = detailSPBService.getDetailSPBById(id);

        return new ResponseEntity<DetailSPBResult>(detailSPBResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DetailSPBResult> addDetailSPB(@RequestBody DetailSPB detailSPB) {
        detailSPBService.addDetailSPB(detailSPB);
        DetailSPBResult detailSPBResult = detailSPBService.getDetailSPBById(detailSPBService.lastestInput());

        return new ResponseEntity<DetailSPBResult>(detailSPBResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetailSPBResult> updateDetailSPB(@PathVariable("id") int id, @RequestBody DetailSPB detailSPB) {
        detailSPBService.updateDetailSPB(detailSPB, id);
        DetailSPBResult detailSPBResult = detailSPBService.getDetailSPBById(id);

        return new ResponseEntity<DetailSPBResult>(detailSPBResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetailSPBResult> deleteDetailSPB(@PathVariable("id") int id) {
        DetailSPBResult detailSPBResult = detailSPBService.getDetailSPBById(id);
        detailSPBService.deleteDetailSPB(id);

        return new ResponseEntity<DetailSPBResult>(detailSPBResult, HttpStatus.OK);
    }
}
