package com.brightman.inventory.detail_do;

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
@RequestMapping("detailDO")
public class DetailDOController {
    @Autowired
    private DetailDOService detailDOService;

    @GetMapping("/")
    public ResponseEntity<List<DetailDOResult>> getAll() {
        List<DetailDOResult> listDetailDO = detailDOService.getAllDetailDO();

        return new ResponseEntity<List<DetailDOResult>>(listDetailDO, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailDOResult> getById(@PathVariable("id") int id) {
        DetailDOResult detailDOResult = detailDOService.getDetailDOById(id);

        return new ResponseEntity<DetailDOResult>(detailDOResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DetailDOResult> addDetailDO(@RequestBody DetailDO detailDO) {
        detailDOService.addDetailDO(detailDO);
        DetailDOResult detailDOResult = detailDOService.getDetailDOById(detailDOService.lastestInput());

        return new ResponseEntity<DetailDOResult>(detailDOResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetailDOResult> updateDetailDO(@PathVariable("id") int id, @RequestBody DetailDO detailDO) {
        detailDOService.updateDetailDO(detailDO, id);
        DetailDOResult detailDOResult = detailDOService.getDetailDOById(id);

        return new ResponseEntity<DetailDOResult>(detailDOResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetailDOResult> deleteDetailDO(@PathVariable("id") int id) {
        DetailDOResult detailDOResult = detailDOService.getDetailDOById(id);
        detailDOService.deleteDetailDO(id);

        return new ResponseEntity<DetailDOResult>(detailDOResult, HttpStatus.OK);
    }
}
