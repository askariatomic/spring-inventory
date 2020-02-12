package com.brightman.inventory.receivable;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ReceivableMapper implements RowMapper<ReceivableResult>{
    @Override
    public ReceivableResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Receivable receivable = new Receivable();
        receivable.setReceiveID(rs.getInt("receiveID"));
        receivable.setReceiveNo(rs.getString("receiveNo"));
        receivable.setInvoiceID(rs.getInt("invoiceID"));
        receivable.setInvoiceNo(rs.getString("invoiceNo"));
        receivable.setCustomerID(rs.getInt("customerID"));
        receivable.setCustomerName(rs.getString("customerName"));
        receivable.setCustomerAddress(rs.getString("customerAddress"));
        receivable.setReceiveTotal(rs.getFloat("receiveTotal"));
        receivable.setIncomingTotal(rs.getFloat("incomingTotal"));
        receivable.setReductionTotal(rs.getFloat("reductionTotal"));
        receivable.setStatus(rs.getString("status"));
        receivable.setStaffID(rs.getInt("staffID"));
        receivable.setStaffName(rs.getString("staffName"));
        receivable.setCreatedDate(rs.getString("createdDate"));
        receivable.setCreatedUserID(rs.getInt("createdUserID"));
        receivable.setModifiedDate(rs.getString("modifiedDate"));
        receivable.setModifiedUserID(rs.getInt("modifiedUserID"));

        ReceivableResult receivableResult = new ReceivableResult();
        receivableResult.setReceiveID(rs.getInt("receiveID"));
        receivableResult.setReceiveNo(rs.getString("receiveNo"));
        receivableResult.setInvoiceID(rs.getInt("invoiceID"));
        receivableResult.setInvoiceNo(rs.getString("invoiceNo"));
        receivableResult.setCustomerID(rs.getInt("customerID"));
        receivableResult.setCustomerName(rs.getString("customerName"));
        receivableResult.setCustomerAddress(rs.getString("customerAddress"));
        receivableResult.setReceiveTotal(rs.getFloat("receiveTotal"));
        receivableResult.setIncomingTotal(rs.getFloat("incomingTotal"));
        receivableResult.setReductionTotal(rs.getFloat("reductionTotal"));
        receivableResult.setStatus(rs.getString("status"));
        receivableResult.setStaffID(rs.getInt("staffID"));
        receivableResult.setStaffName(rs.getString("staffName"));
        receivableResult.setCreatedDate(rs.getString("createdDate"));
        receivableResult.setCreatedUserID(rs.getInt("createdUserID"));
        receivableResult.setModifiedDate(rs.getString("modifiedDate"));
        receivableResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return receivableResult;
    }
}
        