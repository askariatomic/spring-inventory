package com.brightman.inventory.detail_transfer;

import java.util.List;

public interface DetailTransferDAO {
    List<DetailTransferResult> getAllDetailTransfer();
    DetailTransferResult getDetailTransferById(int id);
    void addDetailTransfer(DetailTransfer detailTransfer);
    void updateDetailTransfer(DetailTransfer detailTransfer, int id);
    void deleteDetailTransfer(int id);
    int lastestInput();
}
