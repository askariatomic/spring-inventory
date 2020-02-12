package com.brightman.inventory.detail_so;

import java.util.List;

public interface DetailSOService {
    List<DetailSOResult> getAllDetailSO();
    DetailSOResult getDetailSOById(int id);
    void addDetailSO(DetailSO detailSO);
    void updateDetailSO(DetailSO detailSO, int id);
    void deleteDetailSO(int id);
    int lastestInput();
}
