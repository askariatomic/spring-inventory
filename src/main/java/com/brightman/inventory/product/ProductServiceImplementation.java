package com.brightman.inventory.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplementation implements ProductService {
    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<ProductResult> getAllProduct() {
        return productDAO.getAllProduct();
    }

    @Override
    public ProductResult getProductById(int id) {
        return productDAO.getProductById(id);
    }

    @Override
    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    @Override
    public void updateProduct(Product product, int id) {
        productDAO.updateProduct(product, id);
    }

    @Override
    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }

    @Override
    public int lastestInput() {
        return productDAO.lastestInput();
    }
}
