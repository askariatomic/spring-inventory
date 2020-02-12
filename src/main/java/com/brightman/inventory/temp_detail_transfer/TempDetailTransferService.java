package com.brightman.inventory.temp_detail_transfer;

import java.util.List;

public interface TempDetailTransferService {
    List<TempDetailTransferResult> getAllTempDetailTransfer();
    TempDetailTransferResult getTempDetailTransferById(int id);
    void addTempDetailTransfer(TempDetailTransfer tempDetailTransfer);
    void updateTempDetailTransfer(TempDetailTransfer tempDetailTransfer, int id);
    void deleteTempDetailTransferById(int id);
    int lastestInput();
}
