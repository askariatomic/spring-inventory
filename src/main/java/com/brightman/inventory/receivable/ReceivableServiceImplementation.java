package com.brightman.inventory.receivable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceivableServiceImplementation implements ReceivableService {
    @Autowired
    private ReceivableDAO receivableDAO;

    @Override
    public List<ReceivableResult> getAllReceivable() {
        return receivableDAO.getAllReceivable();
    }

    @Override
    public ReceivableResult getReceivableById(int id) {
        return receivableDAO.getReceivableById(id);
    }

    @Override
    public void addReceivable(Receivable receivable) {
        receivableDAO.addReceivable(receivable);
    }

    @Override
    public void updateReceivable(Receivable receivable, int id) {
        receivableDAO.updateReceivable(receivable, id);
    }

    @Override
    public void deleteReceivable(int id) {
        receivableDAO.deleteReceivable(id);
    }

    @Override
    public int lastestInput() {
        return receivableDAO.lastestInput();
    }
}
