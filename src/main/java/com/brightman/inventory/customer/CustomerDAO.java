package com.brightman.inventory.customer;

import java.util.List;

public interface CustomerDAO {
    List<CustomerResult> getAllCustomer();
    List<CustomerResult> getCustomers(int pageNo, int pageSize, String sortBy);
    CustomerResult getCustomerById(int id);
    void createCustomer(Customer customer);
    void updateCustomer(Customer customer, int id);
    void deleteCustomer(int id);
    int lastestInput();
}
