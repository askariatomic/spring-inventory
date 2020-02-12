package com.brightman.inventory.staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImplementation implements StaffService {
    @Autowired
    private StaffDAO staffDAO;

    @Override
    public List<StaffResult> getAllStaff() {
        return staffDAO.getAllStaff();
    }

    @Override
    public StaffResult getStaffById(int id) {
        return staffDAO.getStaffById(id);
    }

    @Override
    public void addStaff(Staff staff) {
        staffDAO.addStaff(staff);
    }

    @Override
    public void updateStaff(Staff staff, int id) {
        staffDAO.updateStaff(staff, id);
    }

    @Override
    public void deleteStaff(int id) {
        staffDAO.deleteStaff(id);
    }

    @Override
    public int lastestInput() {
        return staffDAO.lastestInput();
    }
}
