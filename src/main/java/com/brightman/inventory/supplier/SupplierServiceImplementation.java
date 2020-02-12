package com.brightman.inventory.supplier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImplementation implements SupplierService {
    @Autowired
    private SupplierDAO supplierDAO;

    @Override
    public List<SupplierResult> getAllSupplier() {
        return supplierDAO.getAllSupplier();
    }

    @Override
    public SupplierResult getSupplierById(int id) {
        return supplierDAO.getSupplierById(id);
    }

    @Override
    public void addSupplier(Supplier supplier) {
        supplierDAO.addSupplier(supplier);
    }

    @Override
    public void updateSupplier(Supplier supplier, int id) {
        supplierDAO.updateSupplier(supplier, id);
    }

    @Override
    public void deleteSupplierById(int id) {
        supplierDAO.deleteSupplierById(id);
    }

    @Override
    public int lastestInput() {
        return supplierDAO.lastestInput();
    }
}

