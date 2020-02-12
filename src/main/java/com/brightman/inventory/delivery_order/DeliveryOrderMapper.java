package com.brightman.inventory.delivery_order;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DeliveryOrderMapper implements RowMapper<DeliveryOrderResult>{
    @Override
    public DeliveryOrderResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        DeliveryOrder deliveryOrder = new DeliveryOrder();
        deliveryOrder.setDoID(rs.getInt("doID"));
        deliveryOrder.setDoNo(rs.getString("doNo"));
        deliveryOrder.setDoFaktur(rs.getString("doFaktur"));
        deliveryOrder.setSoID(rs.getInt("soID"));
        deliveryOrder.setSoNo(rs.getString("soNo"));
        deliveryOrder.setCustomerID(rs.getInt("customerID"));
        deliveryOrder.setCustomerName(rs.getString("customerName"));
        deliveryOrder.setCustomerAddress(rs.getString("customerAddress"));
        deliveryOrder.setStaffID(rs.getInt("staffID"));
        deliveryOrder.setStaffName(rs.getString("staffName"));
        deliveryOrder.setDeliveredDate(rs.getString("deliveredDate"));
        deliveryOrder.setOrderDate(rs.getString("orderDate"));
        deliveryOrder.setNeedDate(rs.getInt("needDate"));
        deliveryOrder.setTotal(rs.getFloat("total"));
        deliveryOrder.setNote(rs.getString("note"));
        deliveryOrder.setCreatedDate(rs.getString("createdDate"));
        deliveryOrder.setCreatedUserID(rs.getInt("createdUserID"));
        deliveryOrder.setModifiedDate(rs.getFloat("modifiedDate"));
        deliveryOrder.setModifiedUserID(rs.getInt("modifiedUserID"));

        DeliveryOrderResult deliveryOrderResult = new DeliveryOrderResult();
        deliveryOrderResult.setDoID(rs.getInt("doID"));
        deliveryOrderResult.setDoNo(rs.getString("doNo"));
        deliveryOrderResult.setDoFaktur(rs.getString("doFaktur"));
        deliveryOrderResult.setSoID(rs.getInt("soID"));
        deliveryOrderResult.setSoNo(rs.getString("soNo"));
        deliveryOrderResult.setCustomerID(rs.getInt("customerID"));
        deliveryOrderResult.setCustomerName(rs.getString("customerName"));
        deliveryOrderResult.setCustomerAddress(rs.getString("customerAddress"));
        deliveryOrderResult.setStaffID(rs.getInt("staffID"));
        deliveryOrderResult.setStaffName(rs.getString("staffName"));
        deliveryOrderResult.setDeliveredDate(rs.getString("deliveredDate"));
        deliveryOrderResult.setOrderDate(rs.getString("orderDate"));
        deliveryOrderResult.setNeedDate(rs.getInt("needDate"));
        deliveryOrderResult.setTotal(rs.getFloat("total"));
        deliveryOrderResult.setNote(rs.getString("note"));
        deliveryOrderResult.setCreatedDate(rs.getString("createdDate"));
        deliveryOrderResult.setCreatedUserID(rs.getInt("createdUserID"));
        deliveryOrderResult.setModifiedDate(rs.getFloat("modifiedDate"));
        deliveryOrderResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return deliveryOrderResult;
    }
}
        