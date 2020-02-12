package com.brightman.inventory.sales_order;

import java.util.List;

public interface SalesOrderService {
    List<SalesOrderResult> getAllSalesOrder();
    SalesOrderResult getSalesOrderById(int id);
    void addSalesOrder(SalesOrder salesOrder);
    void updateSalesOrder(SalesOrder salesOrder, int id);
    void deleteSalesOrder(int id);
    int lastestInput();
}
