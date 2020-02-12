package com.brightman.inventory.buy_transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyTransactionServiceImplementation implements BuyTransactionService {
    @Autowired
    private BuyTransactionDAO buyTransactionDAO;

    @Override
    public List<BuyTransactionResult> getAllBuyTransaction() {
        return buyTransactionDAO.getAllBuyTransaction();
    }

    @Override
    public BuyTransactionResult getBuyTransactionById(int id) {
        return buyTransactionDAO.getBuyTransactionById(id);
    }

    @Override
    public void addBuyTransaction(BuyTransaction buyTransaction) {
        buyTransactionDAO.addBuyTransaction(buyTransaction);
    }

    @Override
    public void updateBuyTransaction(BuyTransaction buyTransaction, int id) {
        buyTransactionDAO.updateBuyTransaction(buyTransaction, id);
    }

    @Override
    public void deleteBuyTransaction(int id) {
        buyTransactionDAO.deleteBuyTransaction(id);
    }

    @Override
    public int lastestInput() {
        return buyTransactionDAO.lastestInput();
    }
}
