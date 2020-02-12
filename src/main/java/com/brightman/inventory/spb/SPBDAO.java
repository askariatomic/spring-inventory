package com.brightman.inventory.spb;

import java.util.List;

public interface SPBDAO {
    List<SPBResult> getAllSPB();
    SPBResult getSPBById(int id);
    void addSPB(SPB spb);
    void updateSPB(SPB spb, int id);
    void deleteSPB(int id);
    int lastestInput();
}
