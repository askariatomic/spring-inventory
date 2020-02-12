package com.brightman.inventory.buy_payment;

import java.util.List;

public interface BuyPaymentService {
    List<BuyPaymentResult> getAllBuyPayment();
    BuyPaymentResult getBuyPaymentById(int id);
    void addBuyPayment(BuyPayment buyPayment);
    void updateBuyPayment(BuyPayment buyPayment, int id);
    void deleteBuyPayment(int id);
    int lastestInput();
}
