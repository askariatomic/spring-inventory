package com.brightman.inventory.retur_staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturStaffServiceImplementation implements ReturStaffService {
    @Autowired
    private ReturStaffDAO returStaffDAO;

    @Override
    public List<ReturStaffResult> getAllReturStaff() {
        return returStaffDAO.getAllReturStaff();
    }

    @Override
    public ReturStaffResult getReturStaffById(int id) {
        return returStaffDAO.getReturStaffById(id);
    }

    @Override
    public void addReturStaff(ReturStaff returStaff) {
        returStaffDAO.addReturStaff(returStaff);
    }

    @Override
    public void updateReturStaff(ReturStaff returStaff, int id) {
        returStaffDAO.updateReturStaff(returStaff, id);
    }

    @Override
    public void deleteReturStaff(int id) {
        returStaffDAO.deleteReturStaff(id);
    }

    @Override
    public int lastestInput() {
        return returStaffDAO.lastestInput();
    }
}
