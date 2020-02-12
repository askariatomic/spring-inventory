package com.brightman.inventory.temp_detail_so;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TempDetailSOServiceImplementation implements TempDetailSOService {
    @Autowired
    private TempDetailSODAO tempDetailSODAO;

    @Override
    public List<TempDetailSOResult> getAllTempDetailSO() {
        return tempDetailSODAO.getAllTempDetailSO();
    }

    @Override
    public TempDetailSOResult getTempDetailSOById(int id) {
        return tempDetailSODAO.getTempDetailSOById(id);
    }

    @Override
    public void addTempDetailSO(TempDetailSO tempDetailSO) {
        tempDetailSODAO.addTempDetailSO(tempDetailSO);
    }

    @Override
    public void updateTempDetailSO(TempDetailSO tempDetailSO, int id) {
        tempDetailSODAO.updateTempDetailSO(tempDetailSO, id);
    }

    @Override
    public void deleteTempDetailSOById(int id) {
        tempDetailSODAO.deleteTempDetailSOById(id);
    }

    @Override
    public int lastestInput() {
        return tempDetailSODAO.lastestInput();
    }
}
