package com.brightman.inventory.sales_transaction;

import java.util.List;

public interface SalesTransactionService {
    List<SalesTransactionResult> getAllSalesTransaction();
    SalesTransactionResult getSalesTransactionById(int id);
    void addSalesTransaction(SalesTransaction salesTransaction);
    void updateSalesTransaction(SalesTransaction salesTransaction, int id);
    void deleteSalesTransaction(int id);
    int lastestInput();
}
