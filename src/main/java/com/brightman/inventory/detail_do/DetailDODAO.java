package com.brightman.inventory.detail_do;

import java.util.List;

public interface DetailDODAO {
    List<DetailDOResult> getAllDetailDO();
    DetailDOResult getDetailDOById(int id);
    void addDetailDO(DetailDO detailDO);
    void updateDetailDO(DetailDO detailDO, int id);
    void deleteDetailDO(int id);
    int lastestInput();
}
