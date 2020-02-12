package com.brightman.inventory.category;

import java.util.List;

public interface CategoryDAO {
    List<CategoryResult> getAllCategory();
    CategoryResult getCategoryById(int id);
    void addCategory(Category category);
    void updateCategory(Category category, int id);
    void deleteCategory(int id);
    int lastestInput();
}
