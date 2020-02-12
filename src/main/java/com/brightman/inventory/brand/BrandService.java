package com.brightman.inventory.brand;

import java.util.List;

public interface BrandService {
    List<BrandResult> getAllBrand();    
    BrandResult getBrandById(int id);    
    void addBrand(Brand brand);    
    void updateBrand(Brand brand, int id);    
    void deleteBrand(int id);    
    int lastestInput();
}
