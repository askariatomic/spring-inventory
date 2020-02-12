package com.brightman.inventory.detail_bbm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailBBMServiceImplementation implements DetailBBMService {
    @Autowired
    private DetailBBMDAO detailBBMDAO;

    @Override
    public List<DetailBBMResult> getAllDetailBBM() {
        return detailBBMDAO.getAllDetailBBM();
    }

    @Override
    public DetailBBMResult getDetailBBMById(int id) {
        return detailBBMDAO.getDetailBBMById(id);
    }

    @Override
    public void addDetailBBM(DetailBBM detailBBM) {
        detailBBMDAO.addDetailBBM(detailBBM);
    }

    @Override
    public void updateDetailBBM(DetailBBM detailBBM, int id) {
        detailBBMDAO.updateDetailBBM(detailBBM, id);
    }

    @Override
    public void deleteDetailBBM(int id) {
        detailBBMDAO.deleteDetailBBM(id);
    }

    @Override
    public int lastestInput() {
        return detailBBMDAO.lastestInput();
    }
}
