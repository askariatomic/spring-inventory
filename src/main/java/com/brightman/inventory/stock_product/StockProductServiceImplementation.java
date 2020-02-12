package com.brightman.inventory.stock_product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockProductServiceImplementation implements StockProductService {
    @Autowired
    private StockProductDAO stockProductDAO;

    @Override
    public List<StockProductResult> getAllStockProduct() {
        return stockProductDAO.getAllStockProduct();
    }

    @Override
    public StockProductResult getStockProductById(int id) {
        return stockProductDAO.getStockProductById(id);
    }

    @Override
    public void addStockProduct(StockProduct stockProduct) {
        stockProductDAO.addStockProduct(stockProduct);
    }

    @Override
    public void updateStockProduct(StockProduct stockProduct, int id) {
        stockProductDAO.updateStockProduct(stockProduct, id);
    }

    @Override
    public void deleteStockProductById(int id) {
        stockProductDAO.deleteStockProductById(id);
    }

    @Override
    public int lastestInput() {
        return stockProductDAO.lastestInput();
    }
}
