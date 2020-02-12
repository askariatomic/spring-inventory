package com.brightman.inventory.temp_detail_spb;

import java.util.List;

public interface TempDetailSPBDAO {
    List<TempDetailSPBResult> getAllTempDetailSPB();
    TempDetailSPBResult getTempDetailSPBById(int id);
    void addTempDetailSPB(TempDetailSPB tempDetailSPB);
    void updateTempDetailSPB(TempDetailSPB tempDetailSPB, int id);
    void deleteTempDetailSPBById(int id);
    int lastestInput();
}
