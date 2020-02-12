package com.brightman.inventory.temp_detail_transfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TempDetailTransferServiceImplementation implements TempDetailTransferService {
    @Autowired
    private TempDetailTransferDAO tempDetailTransferDAO;

    @Override
    public List<TempDetailTransferResult> getAllTempDetailTransfer() {
        return tempDetailTransferDAO.getAllTempDetailTransfer();
    }

    @Override
    public TempDetailTransferResult getTempDetailTransferById(int id) {
        return tempDetailTransferDAO.getTempDetailTransferById(id);
    }

    @Override
    public void addTempDetailTransfer(TempDetailTransfer tempDetailTransfer) {
        tempDetailTransferDAO.addTempDetailTransfer(tempDetailTransfer);
    }

    @Override
    public void updateTempDetailTransfer(TempDetailTransfer tempDetailTransfer, int id) {
        tempDetailTransferDAO.updateTempDetailTransfer(tempDetailTransfer, id);
    }

    @Override
    public void deleteTempDetailTransferById(int id) {
        tempDetailTransferDAO.deleteTempDetailTransferById(id);
    }

    @Override
    public int lastestInput() {
        return tempDetailTransferDAO.lastestInput();
    }
}
