package com.brightman.inventory.brand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImplementation implements BrandService {
    @Autowired
    private BrandDAO brandDAO;

    @Override
    public List<BrandResult> getAllBrand() {
        return brandDAO.getAllBrand();
    }

    @Override
    public BrandResult getBrandById(int id) {
        return brandDAO.getBrandById(id);
    }

    @Override
    public void addBrand(Brand brand) {
        brandDAO.addBrand(brand);
    }

    @Override
    public void updateBrand(Brand brand, int id) {
        brandDAO.updateBrand(brand, id);
    }

    @Override
    public void deleteBrand(int id) {
        brandDAO.deleteBrandById(id);
    }

    @Override
    public int lastestInput() {
        return brandDAO.lastestInput();
    }
}
