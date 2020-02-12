package com.brightman.inventory.sales_order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesOrderServiceImplementation implements SalesOrderService {
    @Autowired
    private SalesOrderDAO salesOrderDAO;

    @Override
    public List<SalesOrderResult> getAllSalesOrder() {
        return salesOrderDAO.getAllSalesOrder();
    }

    @Override
    public SalesOrderResult getSalesOrderById(int id) {
        return salesOrderDAO.getSalesOrderById(id);
    }

    @Override
    public void addSalesOrder(SalesOrder salesOrder) {
        salesOrderDAO.addSalesOrder(salesOrder);
    }

    @Override
    public void updateSalesOrder(SalesOrder salesOrder, int id) {
        salesOrderDAO.updateSalesOrder(salesOrder, id);
    }

    @Override
    public void deleteSalesOrder(int id) {
        salesOrderDAO.deleteSalesOrder(id);
    }

    @Override
    public int lastestInput() {
        return salesOrderDAO.lastestInput();
    }
}
