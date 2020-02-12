package com.brightman.inventory.sales_transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesTransactionServiceImplementation implements SalesTransactionService {
    @Autowired
    private SalesTransactionDAO salesTransactionDAO;

    @Override
    public List<SalesTransactionResult> getAllSalesTransaction() {
        return salesTransactionDAO.getAllSalesTransaction();
    }

    @Override
    public SalesTransactionResult getSalesTransactionById(int id) {
        return salesTransactionDAO.getSalesTransactionById(id);
    }

    @Override
    public void addSalesTransaction(SalesTransaction salesTransaction) {
        salesTransactionDAO.addSalesTransaction(salesTransaction);
    }

    @Override
    public void updateSalesTransaction(SalesTransaction salesTransaction, int id) {
        salesTransactionDAO.updateSalesTransaction(salesTransaction, id);
    }

    @Override
    public void deleteSalesTransaction(int id) {
        salesTransactionDAO.deleteSalesTransaction(id);
    }

    @Override
    public int lastestInput() {
        return salesTransactionDAO.lastestInput();
    }
}
