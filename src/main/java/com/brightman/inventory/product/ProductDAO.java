package com.brightman.inventory.product;

import java.util.List;

public interface ProductDAO {
    List<ProductResult> getAllProduct();
    ProductResult getProductById(int id);
    void addProduct(Product product);
    void updateProduct(Product product, int id);
    void deleteProduct(int id);
    int lastestInput();
}
