package com.brightman.inventory.temp_detail_so;

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
@RequestMapping("tempDetailSO")
public class TempDetailSOController {
    @Autowired
    private TempDetailSOService tempDetailSOService;

    @GetMapping("/")
    public ResponseEntity<List<TempDetailSOResult>> getAll() {
        List<TempDetailSOResult> listTempDetailSO = tempDetailSOService.getAllTempDetailSO();

        return new ResponseEntity<List<TempDetailSOResult>>(listTempDetailSO, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TempDetailSOResult> getById(@PathVariable("id") int id) {
        TempDetailSOResult tempDetailSOResult = tempDetailSOService.getTempDetailSOById(id);

        return new ResponseEntity<TempDetailSOResult>(tempDetailSOResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<TempDetailSOResult> addTempDetailSO(@RequestBody TempDetailSO tempDetailSO) {
        tempDetailSOService.addTempDetailSO(tempDetailSO);
        TempDetailSOResult tempDetailSOResult = tempDetailSOService.getTempDetailSOById(tempDetailSOService.lastestInput());

        return new ResponseEntity<TempDetailSOResult>(tempDetailSOResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TempDetailSOResult> updateTempDetailSO(@PathVariable("id") int id, @RequestBody TempDetailSO tempDetailSO) {
        tempDetailSOService.updateTempDetailSO(tempDetailSO, id);
        TempDetailSOResult tempDetailSOResult = tempDetailSOService.getTempDetailSOById(id);

        return new ResponseEntity<TempDetailSOResult>(tempDetailSOResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TempDetailSOResult> deleteTempDetailSO(@PathVariable("id") int id) {
        TempDetailSOResult tempDetailSOResult = tempDetailSOService.getTempDetailSOById(id);
        tempDetailSOService.deleteTempDetailSOById(id);

        return new ResponseEntity<TempDetailSOResult>(tempDetailSOResult, HttpStatus.OK);
    }
}
