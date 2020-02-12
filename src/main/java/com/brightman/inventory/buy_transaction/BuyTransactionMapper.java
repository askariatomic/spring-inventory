package com.brightman.inventory.buy_transaction;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BuyTransactionMapper implements RowMapper<BuyTransactionResult>{
    @Override
    public BuyTransactionResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        BuyTransaction buyTransaction = new BuyTransaction();
        buyTransaction.setInvoiceID(rs.getInt("invoiceID"));
        buyTransaction.setInvoiceNo(rs.getString("invoiceNo"));
        buyTransaction.setInvoiceDate(rs.getString("invoiceDate"));
        buyTransaction.setBbmNo(rs.getString("bbmNo"));
        buyTransaction.setSpbNo(rs.getString("spbNo"));
        buyTransaction.setPaymentType(rs.getInt("paymentType"));
        buyTransaction.setExpiredPayment(rs.getString("expiredPayment"));
        buyTransaction.setPpnType(rs.getInt("ppnType"));
        buyTransaction.setPpn(rs.getFloat("ppn"));
        buyTransaction.setTotal(rs.getFloat("total"));
        buyTransaction.setBasic(rs.getFloat("basic"));
        buyTransaction.setDiscount(rs.getFloat("discount"));
        buyTransaction.setGrandtotal(rs.getFloat("grandtotal"));
        buyTransaction.setSupplierID(rs.getInt("supplierID"));
        buyTransaction.setSupplierName(rs.getString("supplierName"));
        buyTransaction.setSupplierAddress(rs.getString("supplierAddress"));
        buyTransaction.setStaffID(rs.getInt("staffID"));
        buyTransaction.setStaffName(rs.getString("staffName"));
        buyTransaction.setCreatedDate(rs.getString("createdDate"));
        buyTransaction.setCreatedUserID(rs.getInt("createdUserID"));
        buyTransaction.setModifiedDate(rs.getString("modifiedDate"));
        buyTransaction.setModifiedUserID(rs.getInt("modifiedUserID"));

        BuyTransactionResult buyTransactionResult = new BuyTransactionResult();
        buyTransactionResult.setInvoiceID(rs.getInt("invoiceID"));
        buyTransactionResult.setInvoiceNo(rs.getString("invoiceNo"));
        buyTransactionResult.setInvoiceDate(rs.getString("invoiceDate"));
        buyTransactionResult.setBbmNo(rs.getString("bbmNo"));
        buyTransactionResult.setSpbNo(rs.getString("spbNo"));
        buyTransactionResult.setPaymentType(rs.getInt("paymentType"));
        buyTransactionResult.setExpiredPayment(rs.getString("expiredPayment"));
        buyTransactionResult.setPpnType(rs.getInt("ppnType"));
        buyTransactionResult.setPpn(rs.getFloat("ppn"));
        buyTransactionResult.setTotal(rs.getFloat("total"));
        buyTransactionResult.setBasic(rs.getFloat("basic"));
        buyTransactionResult.setDiscount(rs.getFloat("discount"));
        buyTransactionResult.setGrandtotal(rs.getFloat("grandtotal"));
        buyTransactionResult.setSupplierID(rs.getInt("supplierID"));
        buyTransactionResult.setSupplierName(rs.getString("supplierName"));
        buyTransactionResult.setSupplierAddress(rs.getString("supplierAddress"));
        buyTransactionResult.setStaffID(rs.getInt("staffID"));
        buyTransactionResult.setStaffName(rs.getString("staffName"));
        buyTransactionResult.setCreatedDate(rs.getString("createdDate"));
        buyTransactionResult.setCreatedUserID(rs.getInt("createdUserID"));
        buyTransactionResult.setModifiedDate(rs.getString("modifiedDate"));
        buyTransactionResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return buyTransactionResult;
    }
}
