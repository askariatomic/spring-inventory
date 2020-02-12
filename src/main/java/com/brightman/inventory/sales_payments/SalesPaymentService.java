package com.brightman.inventory.sales_payments;

import java.util.List;

public interface SalesPaymentService {
    List<SalesPaymentResult> getAllSalesPayment();
    SalesPaymentResult getSalesPaymentById(int id);
    void addSalesPayment(SalesPayment salesPayment);
    void updateSalesPayment(SalesPayment salesPayment, int id);
    void deleteSalesPayment(int id);
    int lastestInput();
}
