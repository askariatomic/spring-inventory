package com.brightman.inventory.staff;

import java.util.List;

public interface StaffDAO {
    List<StaffResult> getAllStaff();
    StaffResult getStaffById(int id);
    void addStaff(Staff staff);
    void updateStaff(Staff staff, int id);
    void deleteStaff(int id);
    int lastestInput();
}
