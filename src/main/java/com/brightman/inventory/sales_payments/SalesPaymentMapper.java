package com.brightman.inventory.sales_payments;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SalesPaymentMapper implements RowMapper<SalesPaymentResult>{
    @Override
    public SalesPaymentResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        SalesPayment salesPayment = new SalesPayment();
        salesPayment.setPaymentID(rs.getInt("paymentID"));
        salesPayment.setPaymentNo(rs.getString("paymentNo"));
        salesPayment.setInvoiceID(rs.getInt("invoiceID"));
        salesPayment.setInvoiceNo(rs.getString("invoiceNo"));
        salesPayment.setSoNo(rs.getString("soNo"));
        salesPayment.setPaymentDate(rs.getString("paymentDate"));
        salesPayment.setPayType(rs.getString("payType"));
        salesPayment.setBankNo(rs.getString("bankNo"));
        salesPayment.setBankName(rs.getString("bankName"));
        salesPayment.setBankAC(rs.getString("bankAC"));
        salesPayment.setEffectiveDate(rs.getString("effectiveDate"));
        salesPayment.setTotal(rs.getFloat("total"));
        salesPayment.setCustomerID(rs.getInt("customerID"));
        salesPayment.setCustomerName(rs.getString("customerName"));
        salesPayment.setCustomerAddress(rs.getString("customerAddress"));
        salesPayment.setRef(rs.getString("ref"));
        salesPayment.setNote(rs.getString("note"));
        salesPayment.setStaffID(rs.getString("staffID"));
        salesPayment.setStaffName(rs.getString("staffName"));
        salesPayment.setCreatedDate(rs.getString("createdDate"));
        salesPayment.setCreatedUserID(rs.getInt("createdUserID"));
        salesPayment.setModifiedDate(rs.getString("modifiedDate"));
        salesPayment.setModifiedUserID(rs.getInt("modifiedUserID"));

        SalesPaymentResult salesPaymentResult = new SalesPaymentResult();
        salesPaymentResult.setPaymentID(rs.getInt("paymentID"));
        salesPaymentResult.setPaymentNo(rs.getString("paymentNo"));
        salesPaymentResult.setInvoiceID(rs.getInt("invoiceID"));
        salesPaymentResult.setInvoiceNo(rs.getString("invoiceNo"));
        salesPaymentResult.setSoNo(rs.getString("soNo"));
        salesPaymentResult.setPaymentDate(rs.getString("paymentDate"));
        salesPaymentResult.setPayType(rs.getString("payType"));
        salesPaymentResult.setBankNo(rs.getString("bankNo"));
        salesPaymentResult.setBankName(rs.getString("bankName"));
        salesPaymentResult.setBankAC(rs.getString("bankAC"));
        salesPaymentResult.setEffectiveDate(rs.getString("effectiveDate"));
        salesPaymentResult.setTotal(rs.getFloat("total"));
        salesPaymentResult.setCustomerID(rs.getInt("customerID"));
        salesPaymentResult.setCustomerName(rs.getString("customerName"));
        salesPaymentResult.setCustomerAddress(rs.getString("customerAddress"));
        salesPaymentResult.setRef(rs.getString("ref"));
        salesPaymentResult.setNote(rs.getString("note"));
        salesPaymentResult.setStaffID(rs.getString("staffID"));
        salesPaymentResult.setStaffName(rs.getString("staffName"));
        salesPaymentResult.setCreatedDate(rs.getString("createdDate"));
        salesPaymentResult.setCreatedUserID(rs.getInt("createdUserID"));
        salesPaymentResult.setModifiedDate(rs.getString("modifiedDate"));
        salesPaymentResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return salesPaymentResult;
    }
}
