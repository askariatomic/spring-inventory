package com.brightman.inventory.spb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SPBServiceImplementation implements SPBService {
    @Autowired
    private SPBDAO spbDAO;

    @Override
    public List<SPBResult> getAllSPB() {
        return spbDAO.getAllSPB();
    }

    @Override
    public SPBResult getSPBById(int id) {
        return spbDAO.getSPBById(id);
    }

    @Override
    public void addSPB(SPB sPB) {
        spbDAO.addSPB(sPB);
    }

    @Override
    public void updateSPB(SPB sPB, int id) {
        spbDAO.updateSPB(sPB, id);
    }

    @Override
    public void deleteSPB(int id) {
        spbDAO.deleteSPB(id);
    }

    @Override
    public int lastestInput() {
        return spbDAO.lastestInput();
    }
}
