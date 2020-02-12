package com.brightman.inventory.detail_retur_staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailReturStaffServiceImplementation implements DetailReturStaffService {
    @Autowired
    private DetailReturStaffDAO detailReturStaffDAO;

    @Override
    public List<DetailReturStaffResult> getAllDetailReturStaff() {
        return detailReturStaffDAO.getAllDetailReturStaff();
    }

    @Override
    public DetailReturStaffResult getDetailReturStaffById(int id) {
        return detailReturStaffDAO.getDetailReturStaffById(id);
    }

    @Override
    public void addDetailReturStaff(DetailReturStaff detailReturStaff) {
        detailReturStaffDAO.addDetailReturStaff(detailReturStaff);
    }

    @Override
    public void updateDetailReturStaff(DetailReturStaff detailReturStaff, int id) {
        detailReturStaffDAO.updateDetailReturStaff(detailReturStaff, id);
    }

    @Override
    public void deleteDetailReturStaff(int id) {
        detailReturStaffDAO.deleteDetailReturStaff(id);
    }

    @Override
    public int lastestInput() {
        return detailReturStaffDAO.lastestInput();
    }
}
