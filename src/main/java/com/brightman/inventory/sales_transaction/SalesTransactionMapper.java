package com.brightman.inventory.sales_transaction;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SalesTransactionMapper implements RowMapper<SalesTransactionResult>{
    @Override
    public SalesTransactionResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        SalesTransaction salesTransaction = new SalesTransaction();
        salesTransaction.setInvoiceID(rs.getInt("invoiceID"));
        salesTransaction.setInvoiceNo(rs.getString("invoiceNo"));
        salesTransaction.setInvoiceDate(rs.getString("invoiceDate"));
        salesTransaction.setDoNo(rs.getString("doNo"));
        salesTransaction.setSoNo(rs.getString("soNo"));
        salesTransaction.setPaymentType(rs.getInt("paymentType"));
        salesTransaction.setExpiredPayment(rs.getString("expiredPayment"));
        salesTransaction.setPpnType(rs.getInt("ppnType"));
        salesTransaction.setPpn(rs.getFloat("ppn"));
        salesTransaction.setTotal(rs.getFloat("total"));
        salesTransaction.setBasic(rs.getFloat("basic"));
        salesTransaction.setDiscount(rs.getFloat("discount"));
        salesTransaction.setGrandtotal(rs.getFloat("grandtotal"));
        salesTransaction.setCustomerID(rs.getInt("customerID"));
        salesTransaction.setCustomerName(rs.getString("customerName"));
        salesTransaction.setCustomerAddress(rs.getString("customerAddress"));
        salesTransaction.setStaffID(rs.getInt("staffID"));
        salesTransaction.setStaffName(rs.getString("staffName"));
        salesTransaction.setCreatedDate(rs.getInt("createdDate"));
        salesTransaction.setCreatedUserID(rs.getInt("createdUserID"));
        salesTransaction.setModifiedDate(rs.getString("modifiedDate"));
        salesTransaction.setModifiedUserID(rs.getInt("modifiedUserID"));

        SalesTransactionResult salesTransactionResult = new SalesTransactionResult();
        salesTransactionResult.setInvoiceID(rs.getInt("invoiceID"));
        salesTransactionResult.setInvoiceNo(rs.getString("invoiceNo"));
        salesTransactionResult.setInvoiceDate(rs.getString("invoiceDate"));
        salesTransactionResult.setDoNo(rs.getString("doNo"));
        salesTransactionResult.setSoNo(rs.getString("soNo"));
        salesTransactionResult.setPaymentType(rs.getInt("paymentType"));
        salesTransactionResult.setExpiredPayment(rs.getString("expiredPayment"));
        salesTransactionResult.setPpnType(rs.getInt("ppnType"));
        salesTransactionResult.setPpn(rs.getFloat("ppn"));
        salesTransactionResult.setTotal(rs.getFloat("total"));
        salesTransactionResult.setBasic(rs.getFloat("basic"));
        salesTransactionResult.setDiscount(rs.getFloat("discount"));
        salesTransactionResult.setGrandtotal(rs.getFloat("grandtotal"));
        salesTransactionResult.setCustomerID(rs.getInt("customerID"));
        salesTransactionResult.setCustomerName(rs.getString("customerName"));
        salesTransactionResult.setCustomerAddress(rs.getString("customerAddress"));
        salesTransactionResult.setStaffID(rs.getInt("staffID"));
        salesTransactionResult.setStaffName(rs.getString("staffName"));
        salesTransactionResult.setCreatedDate(rs.getInt("createdDate"));
        salesTransactionResult.setCreatedUserID(rs.getInt("createdUserID"));
        salesTransactionResult.setModifiedDate(rs.getString("modifiedDate"));
        salesTransactionResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return salesTransactionResult;
    }
}
        