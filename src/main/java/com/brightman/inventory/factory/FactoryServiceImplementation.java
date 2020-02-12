package com.brightman.inventory.factory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactoryServiceImplementation implements FactoryService {
    @Autowired
    private FactoryDAO factoryDAO;

    @Override
    public List<FactoryResult> getAllFactory() {
        return factoryDAO.getAllFactory();
    }

    @Override
    public FactoryResult getFactoryById(int id) {
        return factoryDAO.getFactoryById(id);
    }

    @Override
    public void addFactory(Factory factory) {
        factoryDAO.addFactory(factory);
    }

    @Override
    public void updateFactory(Factory factory, int id) {
        factoryDAO.updateFactory(factory, id);
    }

    @Override
    public void deleteFactory(int id) {
        factoryDAO.deleteFactory(id);
    }

    @Override
    public int lastestInput() {
        return factoryDAO.lastestInput();
    }
}
