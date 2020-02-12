package com.brightman.inventory.temp_detail_spb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TempDetailSPBServiceImplementation implements TempDetailSPBService {
    @Autowired
    private TempDetailSPBDAO tempDetailSPBDAO;

    @Override
    public List<TempDetailSPBResult> getAllTempDetailSPB() {
        return tempDetailSPBDAO.getAllTempDetailSPB();
    }

    @Override
    public TempDetailSPBResult getTempDetailSPBById(int id) {
        return tempDetailSPBDAO.getTempDetailSPBById(id);
    }

    @Override
    public void addTempDetailSPB(TempDetailSPB tempDetailSPB) {
        tempDetailSPBDAO.addTempDetailSPB(tempDetailSPB);
    }

    @Override
    public void updateTempDetailSPB(TempDetailSPB tempDetailSPB, int id) {
        tempDetailSPBDAO.updateTempDetailSPB(tempDetailSPB, id);
    }

    @Override
    public void deleteTempDetailSPBById(int id) {
        tempDetailSPBDAO.deleteTempDetailSPBById(id);
    }

    @Override
    public int lastestInput() {
        return tempDetailSPBDAO.lastestInput();
    }
}
