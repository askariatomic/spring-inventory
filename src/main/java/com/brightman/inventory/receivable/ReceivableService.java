package com.brightman.inventory.receivable;

import java.util.List;

public interface ReceivableService {
    List<ReceivableResult> getAllReceivable();
    ReceivableResult getReceivableById(int id);
    void addReceivable(Receivable receivable);
    void updateReceivable(Receivable receivable, int id);
    void deleteReceivable(int id);
    int lastestInput();
}
