package com.brightman.inventory.detail_retur_supplier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailReturSupplierServiceImplementation implements DetailReturSupplierService {
    @Autowired
    private DetailReturSupplierDAO detailReturSupplierDAO;

    @Override
    public List<DetailReturSupplierResult> getAllDetailReturSupplier() {
        return detailReturSupplierDAO.getAllDetailReturSupplier();
    }

    @Override
    public DetailReturSupplierResult getDetailReturSupplierById(int id) {
        return detailReturSupplierDAO.getDetailReturSupplierById(id);
    }

    @Override
    public void addDetailReturSupplier(DetailReturSupplier detailReturSupplier) {
        detailReturSupplierDAO.addDetailReturSupplier(detailReturSupplier);
    }

    @Override
    public void updateDetailReturSupplier(DetailReturSupplier detailReturSupplier, int id) {
        detailReturSupplierDAO.updateDetailReturSupplier(detailReturSupplier, id);
    }

    @Override
    public void deleteDetailReturSupplier(int id) {
        detailReturSupplierDAO.deleteDetailReturSupplier(id);
    }

    @Override
    public int lastestInput() {
        return detailReturSupplierDAO.lastestInput();
    }
}
