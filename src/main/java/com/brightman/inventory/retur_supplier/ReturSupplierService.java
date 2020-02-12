package com.brightman.inventory.retur_supplier;

import java.util.List;

public interface ReturSupplierService {
    List<ReturSupplierResult> getAllReturSupplier();
    ReturSupplierResult getReturSupplierById(int id);
    void addReturSupplier(ReturSupplier returSupplier);
    void updateReturSupplier(ReturSupplier returSupplier, int id);
    void deleteReturSupplier(int id);
    int lastestInput();
}
