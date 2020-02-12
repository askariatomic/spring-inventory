package com.brightman.inventory.module;

import java.util.List;

public interface ModuleService {
    List<ModuleResult> getAllModule();
    ModuleResult getModuleById(int id);
    void addModule(Module module);
    void updateModule(Module module, int id);
    void deleteModule(int id);
    int lastestInput();
}
