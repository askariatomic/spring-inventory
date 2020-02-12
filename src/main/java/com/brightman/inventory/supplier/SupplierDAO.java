package com.brightman.inventory.supplier;

import java.util.List;

public interface SupplierDAO {
    List<SupplierResult> getAllSupplier();
    SupplierResult getSupplierById(int id);
    void addSupplier(Supplier supplier);
    void updateSupplier(Supplier supplier, int id);
    void deleteSupplierById(int id);
    int lastestInput();
}
