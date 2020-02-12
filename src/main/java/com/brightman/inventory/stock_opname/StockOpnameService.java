package com.brightman.inventory.stock_opname;

import java.util.List;

public interface StockOpnameService {
    List<StockOpnameResult> getAllStockOpname();
    StockOpnameResult getStockOpnameById(int id);
    void addStockOpname(StockOpname stockOpname);
    void updateStockOpname(StockOpname stockOpname, int id);
    void deleteStockOpnameById(int id);
    int lastestInput();
}
