package com.brightman.inventory.buy_payment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BuyPaymentMapper implements RowMapper<BuyPaymentResult>{
    @Override
    public BuyPaymentResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        BuyPayment buyPayment = new BuyPayment();
        buyPayment.setPaymentID(rs.getInt("paymentID"));
        buyPayment.setPaymentNo(rs.getString("paymentNo"));
        buyPayment.setInvoiceID(rs.getInt("invoiceID"));
        buyPayment.setInvoiceNo(rs.getString("invoiceNo"));
        buyPayment.setSpbNo(rs.getString("spbNo"));
        buyPayment.setPaymentDate(rs.getString("paymentDate"));
        buyPayment.setPayType(rs.getString("payType"));
        buyPayment.setBankNo(rs.getString("bankNo"));
        buyPayment.setBankName(rs.getString("bankName"));
        buyPayment.setBankAC(rs.getString("bankAC"));
        buyPayment.setEffectiveDate(rs.getString("effectiveDate"));
        buyPayment.setTotal(rs.getFloat("total"));
        buyPayment.setSupplierID(rs.getInt("supplierID"));
        buyPayment.setSupplierName(rs.getString("supplierName"));
        buyPayment.setSupplierAddress(rs.getString("supplierAddress"));
        buyPayment.setRef(rs.getString("ref"));
        buyPayment.setNote(rs.getString("note"));
        buyPayment.setStaffID(rs.getInt("staffID"));
        buyPayment.setStaffName(rs.getString("staffName"));
        buyPayment.setCreatedDate(rs.getString("createdDate"));
        buyPayment.setCreatedUserID(rs.getInt("createdUserID"));
        buyPayment.setModifiedDate(rs.getString("modifiedDate"));
        buyPayment.setModifiedUserID(rs.getInt("modifiedUserID"));

        BuyPaymentResult buyPaymentResult = new BuyPaymentResult();
        buyPaymentResult.setPaymentID(rs.getInt("paymentID"));
        buyPaymentResult.setPaymentNo(rs.getString("paymentNo"));
        buyPaymentResult.setInvoiceID(rs.getInt("invoiceID"));
        buyPaymentResult.setInvoiceNo(rs.getString("invoiceNo"));
        buyPaymentResult.setSpbNo(rs.getString("spbNo"));
        buyPaymentResult.setPaymentDate(rs.getString("paymentDate"));
        buyPaymentResult.setPayType(rs.getString("payType"));
        buyPaymentResult.setBankNo(rs.getString("bankNo"));
        buyPaymentResult.setBankName(rs.getString("bankName"));
        buyPaymentResult.setBankAC(rs.getString("bankAC"));
        buyPaymentResult.setEffectiveDate(rs.getString("effectiveDate"));
        buyPaymentResult.setTotal(rs.getFloat("total"));
        buyPaymentResult.setSupplierID(rs.getInt("supplierID"));
        buyPaymentResult.setSupplierName(rs.getString("supplierName"));
        buyPaymentResult.setSupplierAddress(rs.getString("supplierAddress"));
        buyPaymentResult.setRef(rs.getString("ref"));
        buyPaymentResult.setNote(rs.getString("note"));
        buyPaymentResult.setStaffID(rs.getInt("staffID"));
        buyPaymentResult.setStaffName(rs.getString("staffName"));
        buyPaymentResult.setCreatedDate(rs.getString("createdDate"));
        buyPaymentResult.setCreatedUserID(rs.getInt("createdUserID"));
        buyPaymentResult.setModifiedDate(rs.getString("modifiedDate"));
        buyPaymentResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return buyPaymentResult;
    }
}
        