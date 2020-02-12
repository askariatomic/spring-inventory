package com.brightman.inventory.debt;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DebtMapper implements RowMapper<DebtResult>{
    @Override
    public DebtResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Debt debt = new Debt();
        debt.setDebtID(rs.getInt("debtID"));
        debt.setDebtNo(rs.getString("debtNo"));
        debt.setInvoiceID(rs.getInt("invoiceID"));
        debt.setInvoiceNo(rs.getString("invoiceNo"));
        debt.setSupplierID(rs.getInt("supplierID"));
        debt.setSupplierName(rs.getString("supplierName"));
        debt.setSupplierAddress(rs.getString("supplierAddress"));
        debt.setDebtTotal(rs.getFloat("debtTotal"));
        debt.setIncomingTotal(rs.getFloat("incomingTotal"));
        debt.setReductionTotal(rs.getFloat("reductionTotal"));
        debt.setStatus(rs.getString("status"));
        debt.setStaffID(rs.getInt("staffID"));
        debt.setStaffName(rs.getString("staffName"));
        debt.setCreatedDate(rs.getString("createdDate"));
        debt.setCreatedUserID(rs.getInt("createdUserID"));
        debt.setModifiedDate(rs.getString("modifiedDate"));
        debt.setModifiedUserID(rs.getInt("modifiedUserID"));

        DebtResult debtResult = new DebtResult();
        debtResult.setDebtID(rs.getInt("debtID"));
        debtResult.setDebtNo(rs.getString("debtNo"));
        debtResult.setInvoiceID(rs.getInt("invoiceID"));
        debtResult.setInvoiceNo(rs.getString("invoiceNo"));
        debtResult.setSupplierID(rs.getInt("supplierID"));
        debtResult.setSupplierName(rs.getString("supplierName"));
        debtResult.setSupplierAddress(rs.getString("supplierAddress"));
        debtResult.setDebtTotal(rs.getFloat("debtTotal"));
        debtResult.setIncomingTotal(rs.getFloat("incomingTotal"));
        debtResult.setReductionTotal(rs.getFloat("reductionTotal"));
        debtResult.setStatus(rs.getString("status"));
        debtResult.setStaffID(rs.getInt("staffID"));
        debtResult.setStaffName(rs.getString("staffName"));
        debtResult.setCreatedDate(rs.getString("createdDate"));
        debtResult.setCreatedUserID(rs.getInt("createdUserID"));
        debtResult.setModifiedDate(rs.getString("modifiedDate"));
        debtResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return debtResult;
    }
}
        