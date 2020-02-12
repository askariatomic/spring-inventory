package com.brightman.inventory.detail_spb;

import java.util.List;

public interface DetailSPBService {
    List<DetailSPBResult> getAllDetailSPB();
    DetailSPBResult getDetailSPBById(int id);
    void addDetailSPB(DetailSPB detailSPB);
    void updateDetailSPB(DetailSPB detailSPB, int id);
    void deleteDetailSPB(int id);
    int lastestInput();
}
