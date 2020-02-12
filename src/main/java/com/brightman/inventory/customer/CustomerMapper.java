package com.brightman.inventory.customer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<CustomerResult>{
    @Override
    public CustomerResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer customer = new Customer();
        customer.setCustomerID(rs.getInt("customerID"));
        customer.setCustomerCode(rs.getString("customerCode"));
        customer.setCustomerName(rs.getString("customerName"));
        customer.setContactPerson(rs.getString("contactPerson"));
        customer.setAddress(rs.getString("address"));
        customer.setAddress2(rs.getString("address2"));
        customer.setVillage(rs.getString("village"));
        customer.setDistrict(rs.getString("district"));
        customer.setCity(rs.getString("city"));
        customer.setZipCode(rs.getInt("zipCode"));
        customer.setProvince(rs.getString("province"));
        customer.setPhone1(rs.getString("phone1"));
        customer.setPhone2(rs.getString("phone2"));
        customer.setPhone3(rs.getString("phone3"));
        customer.setFax1(rs.getString("fax1"));
        customer.setFax2(rs.getString("fax2"));
        customer.setFax3(rs.getString("fax3"));
        customer.setPhonecp1(rs.getString("phonecp1"));
        customer.setPhonecp2(rs.getString("phonecp2"));
        customer.setEmail(rs.getString("email"));
        customer.setLimitBalance(rs.getInt("limitBalance"));
        customer.setBalance(rs.getFloat("balance"));
        customer.setDisc1(rs.getInt("disc1"));
        customer.setDisc2(rs.getInt("disc2"));
        customer.setDisc3(rs.getInt("disc3"));
        customer.setNote(rs.getString("note"));
        customer.setNpwp(rs.getString("npwp"));
        customer.setPkpName(rs.getString("pkpName"));
        customer.setStaffCode(rs.getString("staffCode"));
        customer.setCreatedDate(rs.getString("createdDate"));
        customer.setCreatedUserID(rs.getInt("createdUserID"));
        customer.setModifiedDate(rs.getString("modifiedDate"));
        customer.setModifiedUserID(rs.getInt("modifiedUserID"));

        CustomerResult customerResult = new CustomerResult();
        customerResult.setCustomerID(rs.getInt("customerID"));
        customerResult.setCustomerCode(rs.getString("customerCode"));
        customerResult.setCustomerName(rs.getString("customerName"));
        customerResult.setContactPerson(rs.getString("contactPerson"));
        customerResult.setAddress(rs.getString("address"));
        customerResult.setAddress2(rs.getString("address2"));
        customerResult.setVillage(rs.getString("village"));
        customerResult.setDistrict(rs.getString("district"));
        customerResult.setCity(rs.getString("city"));
        customerResult.setZipCode(rs.getInt("zipCode"));
        customerResult.setProvince(rs.getString("province"));
        customerResult.setPhone1(rs.getString("phone1"));
        customerResult.setPhone2(rs.getString("phone2"));
        customerResult.setPhone3(rs.getString("phone3"));
        customerResult.setFax1(rs.getString("fax1"));
        customerResult.setFax2(rs.getString("fax2"));
        customerResult.setFax3(rs.getString("fax3"));
        customerResult.setPhonecp1(rs.getString("phonecp1"));
        customerResult.setPhonecp2(rs.getString("phonecp2"));
        customerResult.setEmail(rs.getString("email"));
        customerResult.setLimitBalance(rs.getInt("limitBalance"));
        customerResult.setBalance(rs.getFloat("balance"));
        customerResult.setDisc1(rs.getInt("disc1"));
        customerResult.setDisc2(rs.getInt("disc2"));
        customerResult.setDisc3(rs.getInt("disc3"));
        customerResult.setNote(rs.getString("note"));
        customerResult.setNpwp(rs.getString("npwp"));
        customerResult.setPkpName(rs.getString("pkpName"));
        customerResult.setStaffCode(rs.getString("staffCode"));
        customerResult.setCreatedDate(rs.getString("createdDate"));
        customerResult.setCreatedUserID(rs.getInt("createdUserID"));
        customerResult.setModifiedDate(rs.getString("modifiedDate"));
        customerResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return customerResult;
    }
}
        