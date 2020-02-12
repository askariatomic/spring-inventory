package com.brightman.inventory.retur_staff;

import java.util.List;

public interface ReturStaffService {
    List<ReturStaffResult> getAllReturStaff();
    ReturStaffResult getReturStaffById(int id);
    void addReturStaff(ReturStaff returStaff);
    void updateReturStaff(ReturStaff returStaff, int id);
    void deleteReturStaff(int id);
    int lastestInput();
}
