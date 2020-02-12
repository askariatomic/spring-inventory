package com.brightman.inventory.module;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceImplementation implements ModuleService {
    @Autowired
    private ModuleDAO moduleDAO;

    @Override
    public List<ModuleResult> getAllModule() {
        return moduleDAO.getAllModule();
    }

    @Override
    public ModuleResult getModuleById(int id) {
        return moduleDAO.getModuleById(id);
    }

    @Override
    public void addModule(Module module) {
        moduleDAO.addModule(module);
    }

    @Override
    public void updateModule(Module module, int id) {
        moduleDAO.updateModule(module, id);
    }

    @Override
    public void deleteModule(int id) {
        moduleDAO.deleteModule(id);
    }

    @Override
    public int lastestInput() {
        return moduleDAO.lastestInput();
    }
}
