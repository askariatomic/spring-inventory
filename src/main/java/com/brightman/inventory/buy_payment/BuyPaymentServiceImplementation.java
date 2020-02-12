package com.brightman.inventory.buy_payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyPaymentServiceImplementation implements BuyPaymentService {
    @Autowired
    private BuyPaymentDAO buyPaymentDAO;

    @Override
    public List<BuyPaymentResult> getAllBuyPayment() {
        return buyPaymentDAO.getAllBuyPayment();
    }

    @Override
    public BuyPaymentResult getBuyPaymentById(int id) {
        return buyPaymentDAO.getBuyPaymentById(id);
    }

    @Override
    public void addBuyPayment(BuyPayment buyPayment) {
        buyPaymentDAO.addBuyPayment(buyPayment);
    }

    @Override
    public void updateBuyPayment(BuyPayment buyPayment, int id) {
        buyPaymentDAO.updateBuyPayment(buyPayment, id);
    }

    @Override
    public void deleteBuyPayment(int id) {
        buyPaymentDAO.deleteBuyPayment(id);
    }

    @Override
    public int lastestInput() {
        return buyPaymentDAO.lastestInput();
    }
}
