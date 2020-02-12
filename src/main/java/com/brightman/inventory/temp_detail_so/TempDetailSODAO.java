package com.brightman.inventory.temp_detail_so;

import java.util.List;

public interface TempDetailSODAO {
    List<TempDetailSOResult> getAllTempDetailSO();
    TempDetailSOResult getTempDetailSOById(int id);
    void addTempDetailSO(TempDetailSO tempDetailSO);
    void updateTempDetailSO(TempDetailSO tempDetailSO, int id);
    void deleteTempDetailSOById(int id);
    int lastestInput();
}
