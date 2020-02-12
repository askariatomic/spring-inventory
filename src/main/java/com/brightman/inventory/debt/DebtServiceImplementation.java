package com.brightman.inventory.debt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DebtServiceImplementation implements DebtService {
    @Autowired
    private DebtDAO debtDAO;

    @Override
    public List<DebtResult> getAllDebt() {
        return debtDAO.getAllDebt();
    }

    @Override
    public DebtResult getDebtById(int id) {
        return debtDAO.getDebtById(id);
    }

    @Override
    public void addDebt(Debt debt) {
        debtDAO.addDebt(debt);
    }

    @Override
    public void updateDebt(Debt debt, int id) {
        debtDAO.updateDebt(debt, id);
    }

    @Override
    public void deleteDebt(int id) {
        debtDAO.deleteDebt(id);
    }

    @Override
    public int lastestInput() {
        return debtDAO.lastestInput();
    }
}

