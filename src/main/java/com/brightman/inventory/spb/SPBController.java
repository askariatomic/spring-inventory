package com.brightman.inventory.spb;

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
@RequestMapping("sPB")
public class SPBController {
    @Autowired
    private SPBService sPBService;

    @GetMapping("/")
    public ResponseEntity<List<SPBResult>> getAllSpb() {
        List<SPBResult> listSPB = sPBService.getAllSPB();

        return new ResponseEntity<List<SPBResult>>(listSPB, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SPBResult> getSpbById(@PathVariable("id") int id) {
        SPBResult spbResult = sPBService.getSPBById(id);

        return new ResponseEntity<SPBResult>(spbResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<SPBResult> addSPB(@RequestBody SPB spb) {
        sPBService.addSPB(spb);
        SPBResult spbResult = sPBService.getSPBById(sPBService.lastestInput());

        return new ResponseEntity<SPBResult>(spbResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SPBResult> updateSPB(@PathVariable("id") int id, @RequestBody SPB spb) {
        sPBService.updateSPB(spb, id);
        SPBResult spbResult = sPBService.getSPBById(id);

        return new ResponseEntity<SPBResult>(spbResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SPBResult> deleteSPB(@PathVariable("id") int id) {
        SPBResult spbResult = sPBService.getSPBById(id);
        sPBService.deleteSPB(id);

        return new ResponseEntity<SPBResult>(spbResult, HttpStatus.OK);
    }
}
