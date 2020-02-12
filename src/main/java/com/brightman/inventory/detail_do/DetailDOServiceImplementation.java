package com.brightman.inventory.detail_do;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailDOServiceImplementation implements DetailDOService {
    @Autowired
    private DetailDODAO detailDODAO;

    @Override
    public List<DetailDOResult> getAllDetailDO() {
        return detailDODAO.getAllDetailDO();
    }

    @Override
    public DetailDOResult getDetailDOById(int id) {
        return detailDODAO.getDetailDOById(id);
    }

    @Override
    public void addDetailDO(DetailDO detailDO) {
        detailDODAO.addDetailDO(detailDO);
    }

    @Override
    public void updateDetailDO(DetailDO detailDO, int id) {
        detailDODAO.updateDetailDO(detailDO, id);
    }

    @Override
    public void deleteDetailDO(int id) {
        detailDODAO.deleteDetailDO(id);
    }

    @Override
    public int lastestInput() {
        return detailDODAO.lastestInput();
    }
}
