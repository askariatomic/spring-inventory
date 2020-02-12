package com.brightman.inventory.staff;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StaffMapper implements RowMapper<StaffResult>{
    @Override
    public StaffResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Staff staff = new Staff();
        staff.setStaffID(rs.getInt("staffID"));
        staff.setStaffCode(rs.getString("staffCode"));
        staff.setStaffName(rs.getString("staffName"));
        staff.setAddress(rs.getString("address"));
        staff.setAddress2(rs.getString("address2"));
        staff.setVillage(rs.getString("village"));
        staff.setDistrict(rs.getString("district"));
        staff.setCity(rs.getString("city"));
        staff.setZipCode(rs.getString("zipCode"));
        staff.setProvince(rs.getString("province"));
        staff.setPhone(rs.getString("phone"));
        staff.setPosition(rs.getString("position"));
        staff.setPart(rs.getString("part"));
        staff.setStatus(rs.getString("status"));
        staff.setLevel(rs.getString("level"));
        staff.setPhoto(rs.getString("photo"));
        staff.setEmail(rs.getString("email"));
        staff.setPassword(rs.getString("password"));
        staff.setLastLogin(rs.getString("lastLogin"));
        staff.setCreatedDate(rs.getString("createdDate"));
        staff.setCreatedUserID(rs.getInt("createdUserID"));
        staff.setModifiedDate(rs.getString("modifiedDate"));
        staff.setModifiedUserID(rs.getInt("modifiedUserID"));

        StaffResult staffResult = new StaffResult();
        staffResult.setStaffID(rs.getInt("staffID"));
        staffResult.setStaffCode(rs.getString("staffCode"));
        staffResult.setStaffName(rs.getString("staffName"));
        staffResult.setAddress(rs.getString("address"));
        staffResult.setAddress2(rs.getString("address2"));
        staffResult.setVillage(rs.getString("village"));
        staffResult.setDistrict(rs.getString("district"));
        staffResult.setCity(rs.getString("city"));
        staffResult.setZipCode(rs.getString("zipCode"));
        staffResult.setProvince(rs.getString("province"));
        staffResult.setPhone(rs.getString("phone"));
        staffResult.setPosition(rs.getString("position"));
        staffResult.setPart(rs.getString("part"));
        staffResult.setStatus(rs.getString("status"));
        staffResult.setLevel(rs.getString("level"));
        staffResult.setPhoto(rs.getString("photo"));
        staffResult.setEmail(rs.getString("email"));
        staffResult.setPassword(rs.getString("password"));
        staffResult.setLastLogin(rs.getString("lastLogin"));
        staffResult.setCreatedDate(rs.getString("createdDate"));
        staffResult.setCreatedUserID(rs.getInt("createdUserID"));
        staffResult.setModifiedDate(rs.getString("modifiedDate"));
        staffResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return staffResult;
    }
}
 