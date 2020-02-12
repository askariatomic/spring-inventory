package com.brightman.inventory.temp_detail_spb;

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
@RequestMapping("tempDetailSPB")
public class TempDetailSPBController {
    @Autowired
    private TempDetailSPBService tempDetailSPBService;

    @GetMapping("/")
    public ResponseEntity<List<TempDetailSPBResult>> getAll() {
        List<TempDetailSPBResult> listTempDetailSPB = tempDetailSPBService.getAllTempDetailSPB();

        return new ResponseEntity<List<TempDetailSPBResult>>(listTempDetailSPB, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TempDetailSPBResult> getById(@PathVariable("id") int id) {
        TempDetailSPBResult tempDetailSPBResult = tempDetailSPBService.getTempDetailSPBById(id);

        return new ResponseEntity<TempDetailSPBResult>(tempDetailSPBResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<TempDetailSPBResult> addTempDetailSPB(@RequestBody TempDetailSPB tempDetailSPB) {
        tempDetailSPBService.addTempDetailSPB(tempDetailSPB);
        TempDetailSPBResult tempDetailSPBResult = tempDetailSPBService.getTempDetailSPBById(tempDetailSPBService.lastestInput());

        return new ResponseEntity<TempDetailSPBResult>(tempDetailSPBResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TempDetailSPBResult> updateTempDetailSPB(@PathVariable("id") int id, @RequestBody TempDetailSPB tempDetailSPB) {
        tempDetailSPBService.updateTempDetailSPB(tempDetailSPB, id);
        TempDetailSPBResult tempDetailSPBResult = tempDetailSPBService.getTempDetailSPBById(id);

        return new ResponseEntity<TempDetailSPBResult>(tempDetailSPBResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TempDetailSPBResult> deleteTempDetailSPB(@PathVariable("id") int id) {
        TempDetailSPBResult tempDetailSPBResult = tempDetailSPBService.getTempDetailSPBById(id);
        tempDetailSPBService.deleteTempDetailSPBById(id);

        return new ResponseEntity<TempDetailSPBResult>(tempDetailSPBResult, HttpStatus.OK);
    }
}
