package com.brightman.inventory.buy_transaction;

import java.util.List;

public interface BuyTransactionService {
    List<BuyTransactionResult> getAllBuyTransaction();
    BuyTransactionResult getBuyTransactionById(int id);
    void addBuyTransaction(BuyTransaction buyTransaction);
    void updateBuyTransaction(BuyTransaction buyTransaction, int id);
    void deleteBuyTransaction(int id);
    int lastestInput();
}
