package com.brightman.inventory.sales_payments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesPaymentServiceImplementation implements SalesPaymentService {
    @Autowired
    private SalesPaymentDAO salesPaymentDAO;

    @Override
    public List<SalesPaymentResult> getAllSalesPayment() {
        return salesPaymentDAO.getAllSalesPayment();
    }

    @Override
    public SalesPaymentResult getSalesPaymentById(int id) {
        return salesPaymentDAO.getSalesPaymentById(id);
    }

    @Override
    public void addSalesPayment(SalesPayment salesPayment) {
        salesPaymentDAO.addSalesPayment(salesPayment);
    }

    @Override
    public void updateSalesPayment(SalesPayment salesPayment, int id) {
        salesPaymentDAO.updateSalesPayment(salesPayment, id);
    }

    @Override
    public void deleteSalesPayment(int id) {
        salesPaymentDAO.deleteSalesPayment(id);
    }

    @Override
    public int lastestInput() {
        return salesPaymentDAO.lastestInput();
    }
}
