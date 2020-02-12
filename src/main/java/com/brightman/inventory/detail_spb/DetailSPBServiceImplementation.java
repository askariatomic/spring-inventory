package com.brightman.inventory.detail_spb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailSPBServiceImplementation implements DetailSPBService {
    @Autowired
    private DetailSPBDAO detailSPBDAO;

    @Override
    public List<DetailSPBResult> getAllDetailSPB() {
        return detailSPBDAO.getAllDetailSPB();
    }

    @Override
    public DetailSPBResult getDetailSPBById(int id) {
        return detailSPBDAO.getDetailSPBById(id);
    }

    @Override
    public void addDetailSPB(DetailSPB detailSPB) {
        detailSPBDAO.addDetailSPB(detailSPB);
    }

    @Override
    public void updateDetailSPB(DetailSPB detailSPB, int id) {
        detailSPBDAO.updateDetailSPB(detailSPB, id);
    }

    @Override
    public void deleteDetailSPB(int id) {
        detailSPBDAO.deleteDetailSPB(id);
    }

    @Override
    public int lastestInput() {
        return detailSPBDAO.lastestInput();
    }
}
