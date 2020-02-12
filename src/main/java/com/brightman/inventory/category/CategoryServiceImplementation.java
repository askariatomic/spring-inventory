package com.brightman.inventory.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImplementation implements CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public List<CategoryResult> getAllCategory() {
        return categoryDAO.getAllCategory();
    }

    @Override
    public CategoryResult getCategoryById(int id) {
        return categoryDAO.getCategoryById(id);
    }

    @Override
    public void addCategory(Category category) {
        categoryDAO.addCategory(category);
    }

    @Override
    public void updateCategory(Category category, int id) {
        categoryDAO.updateCategory(category, id);
    }

    @Override
    public void deleteCategory(int id) {
        categoryDAO.deleteCategory(id);
    }

    @Override
    public int lastestInput() {
        return categoryDAO.lastestInput();
    }
}
