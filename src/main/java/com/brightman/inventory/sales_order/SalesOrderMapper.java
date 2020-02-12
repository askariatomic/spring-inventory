package com.brightman.inventory.sales_order;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SalesOrderMapper implements RowMapper<SalesOrderResult>{
    @Override
    public SalesOrderResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        SalesOrder salesOrder = new SalesOrder();
        salesOrder.setSoID(rs.getInt("soID"));
        salesOrder.setSoNo(rs.getString("soNo"));
        salesOrder.setSoFaktur(rs.getString("soFaktur"));
        salesOrder.setCustomerID(rs.getInt("customerID"));
        salesOrder.setCustomerName(rs.getString("customerName"));
        salesOrder.setCustomerAddress(rs.getString("customerAddress"));
        salesOrder.setStaffID(rs.getInt("staffID"));
        salesOrder.setStaffName(rs.getString("staffName"));
        salesOrder.setOrderDate(rs.getString("orderDate"));
        salesOrder.setNeedDate(rs.getString("needDate"));
        salesOrder.setNote(rs.getString("note"));
        salesOrder.setStatus(rs.getString("status"));
        salesOrder.setCreatedDate(rs.getString("createdDate"));
        salesOrder.setCreatedUserID(rs.getInt("createdUserID"));
        salesOrder.setModifiedDate(rs.getString("modifiedDate"));
        salesOrder.setModifiedUserID(rs.getInt("modifiedUserID"));

        SalesOrderResult salesOrderResult = new SalesOrderResult();
        salesOrderResult.setSoID(rs.getInt("soID"));
        salesOrderResult.setSoNo(rs.getString("soNo"));
        salesOrderResult.setSoFaktur(rs.getString("soFaktur"));
        salesOrderResult.setCustomerID(rs.getInt("customerID"));
        salesOrderResult.setCustomerName(rs.getString("customerName"));
        salesOrderResult.setCustomerAddress(rs.getString("customerAddress"));
        salesOrderResult.setStaffID(rs.getInt("staffID"));
        salesOrderResult.setStaffName(rs.getString("staffName"));
        salesOrderResult.setOrderDate(rs.getString("orderDate"));
        salesOrderResult.setNeedDate(rs.getString("needDate"));
        salesOrderResult.setNote(rs.getString("note"));
        salesOrderResult.setStatus(rs.getString("status"));
        salesOrderResult.setCreatedDate(rs.getString("createdDate"));
        salesOrderResult.setCreatedUserID(rs.getInt("createdUserID"));
        salesOrderResult.setModifiedDate(rs.getString("modifiedDate"));
        salesOrderResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return salesOrderResult;
    }
}
