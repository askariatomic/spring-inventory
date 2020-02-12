package com.brightman.inventory.retur_supplier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturSupplierServiceImplementation implements ReturSupplierService {
    @Autowired
    private ReturSupplierDAO returSupplierDAO;

    @Override
    public List<ReturSupplierResult> getAllReturSupplier() {
        return returSupplierDAO.getAllReturSupplier();
    }

    @Override
    public ReturSupplierResult getReturSupplierById(int id) {
        return returSupplierDAO.getReturSupplierById(id);
    }

    @Override
    public void addReturSupplier(ReturSupplier returSupplier) {
        returSupplierDAO.addReturSupplier(returSupplier);
    }

    @Override
    public void updateReturSupplier(ReturSupplier returSupplier, int id) {
        returSupplierDAO.updateReturSupplier(returSupplier, id);
    }

    @Override
    public void deleteReturSupplier(int id) {
        returSupplierDAO.deleteReturSupplier(id);
    }

    @Override
    public int lastestInput() {
        return returSupplierDAO.lastestInput();
    }
}
