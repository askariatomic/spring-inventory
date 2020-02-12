package com.brightman.inventory.detail_so;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailSOServiceImplementation implements DetailSOService {
    @Autowired
    private DetailSODAO detailSODAO;

    @Override
    public List<DetailSOResult> getAllDetailSO() {
        return detailSODAO.getAllDetailSO();
    }

    @Override
    public DetailSOResult getDetailSOById(int id) {
        return detailSODAO.getDetailSOById(id);
    }

    @Override
    public void addDetailSO(DetailSO detailSO) {
        detailSODAO.addDetailSO(detailSO);
    }

    @Override
    public void updateDetailSO(DetailSO detailSO, int id) {
        detailSODAO.updateDetailSO(detailSO, id);
    }

    @Override
    public void deleteDetailSO(int id) {
        detailSODAO.deleteDetailSO(id);
    }

    @Override
    public int lastestInput() {
        return detailSODAO.lastestInput();
    }
}
