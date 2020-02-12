package com.brightman.inventory.debt;

import java.util.List;

public interface DebtDAO {
    List<DebtResult> getAllDebt();
    DebtResult getDebtById(int id);
    void addDebt(Debt debt);
    void updateDebt(Debt debt, int id);
    void deleteDebt(int id);
    int lastestInput();
}
