package com.brightman.inventory.transfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImplementation implements TransferService {
    @Autowired
    private TransferDAO transferDAO;

    @Override
    public List<TransferResult> getAllTransfer() {
        return transferDAO.getAllTransfer();
    }

    @Override
    public TransferResult getTransferById(int id) {
        return transferDAO.getTransferById(id);
    }

    @Override
    public void addTransfer(Transfer transfer) {
        transferDAO.addTransfer(transfer);
    }

    @Override
    public void updateTransfer(Transfer transfer, int id) {
        transferDAO.updateTransfer(transfer, id);
    }

    @Override
    public void deleteTransferById(int id) {
        transferDAO.deleteTransferById(id);
    }

    @Override
    public int lastestInput() {
        return transferDAO.lastestInput();
    }
}
