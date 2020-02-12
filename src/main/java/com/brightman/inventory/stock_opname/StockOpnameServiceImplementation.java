package com.brightman.inventory.stock_opname;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockOpnameServiceImplementation implements StockOpnameService {
    @Autowired
    private StockOpnameDAO stockOpnameDAO;

    @Override
    public List<StockOpnameResult> getAllStockOpname() {
        return stockOpnameDAO.getAllStockOpname();
    }

    @Override
    public StockOpnameResult getStockOpnameById(int id) {
        return stockOpnameDAO.getStockOpnameById(id);
    }

    @Override
    public void addStockOpname(StockOpname stockOpname) {
        stockOpnameDAO.addStockOpname(stockOpname);
    }

    @Override
    public void updateStockOpname(StockOpname stockOpname, int id) {
        stockOpnameDAO.updateStockOpname(stockOpname, id);
    }

    @Override
    public void deleteStockOpnameById(int id) {
        stockOpnameDAO.deleteStockOpnameById(id);
    }

    @Override
    public int lastestInput() {
        return stockOpnameDAO.lastestInput();
    }
}
