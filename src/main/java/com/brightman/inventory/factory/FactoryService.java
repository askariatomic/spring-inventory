package com.brightman.inventory.factory;

import java.util.List;

public interface FactoryService {
    List<FactoryResult> getAllFactory();
    FactoryResult getFactoryById(int id);
    void addFactory(Factory factory);
    void updateFactory(Factory factory, int id);
    void deleteFactory(int id);
    int lastestInput();
}
