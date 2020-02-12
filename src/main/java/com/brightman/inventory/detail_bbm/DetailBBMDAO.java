package com.brightman.inventory.detail_bbm;

import java.util.List;

public interface DetailBBMDAO {
    List<DetailBBMResult> getAllDetailBBM();
    DetailBBMResult getDetailBBMById(int id);
    void addDetailBBM(DetailBBM detailBBM);
    void updateDetailBBM(DetailBBM detailBBM, int id);
    void deleteDetailBBM(int id);
    int lastestInput();
}
