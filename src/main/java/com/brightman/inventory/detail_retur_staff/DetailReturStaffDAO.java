package com.brightman.inventory.detail_retur_staff;

import java.util.List;

public interface DetailReturStaffDAO {
    List<DetailReturStaffResult> getAllDetailReturStaff();
    DetailReturStaffResult getDetailReturStaffById(int id);
    void addDetailReturStaff(DetailReturStaff detailReturStaff);
    void updateDetailReturStaff(DetailReturStaff detailReturStaff, int id);
    void deleteDetailReturStaff(int id);
    int lastestInput();
}
