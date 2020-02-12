package com.brightman.inventory.transfer;

import java.util.List;

public interface TransferDAO {
    List<TransferResult> getAllTransfer();
    TransferResult getTransferById(int id);
    void addTransfer(Transfer transfer);
    void updateTransfer(Transfer transfer, int id);
    void deleteTransferById(int id);
    int lastestInput();
}
