package com.brightman.inventory.detail_retur_supplier;

import java.util.List;

public interface DetailReturSupplierDAO {
    List<DetailReturSupplierResult> getAllDetailReturSupplier();
    DetailReturSupplierResult getDetailReturSupplierById(int id);
    void addDetailReturSupplier(DetailReturSupplier detailReturSupplier);
    void updateDetailReturSupplier(DetailReturSupplier detailReturSupplier, int id);
    void deleteDetailReturSupplier(int id);
    int lastestInput();
}
