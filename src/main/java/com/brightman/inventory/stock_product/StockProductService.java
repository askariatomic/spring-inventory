package com.brightman.inventory.stock_product;

import java.util.List;

public interface StockProductService {
    List<StockProductResult> getAllStockProduct();
    StockProductResult getStockProductById(int id);
    void addStockProduct(StockProduct stockProduct);
    void updateStockProduct(StockProduct stockProduct, int id);
    void deleteStockProductById(int id);
    int lastestInput();
}
