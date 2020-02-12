package com.brightman.inventory.detail_transfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailTransferServiceImplementation implements DetailTransferService {
    @Autowired
    private DetailTransferDAO detailTransferDAO;

    @Override
    public List<DetailTransferResult> getAllDetailTransfer() {
        return detailTransferDAO.getAllDetailTransfer();
    }

    @Override
    public DetailTransferResult getDetailTransferById(int id) {
        return detailTransferDAO.getDetailTransferById(id);
    }

    @Override
    public void addDetailTransfer(DetailTransfer detailTransfer) {
        detailTransferDAO.addDetailTransfer(detailTransfer);
    }

    @Override
    public void updateDetailTransfer(DetailTransfer detailTransfer, int id) {
        detailTransferDAO.updateDetailTransfer(detailTransfer, id);
    }

    @Override
    public void deleteDetailTransfer(int id) {
        detailTransferDAO.deleteDetailTransfer(id);
    }

    @Override
    public int lastestInput() {
        return detailTransferDAO.lastestInput();
    }
}
