package com.brightman.inventory.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImplementation implements CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public List<CustomerResult> getAllCustomer() {
        return customerDAO.getAllCustomer();
    }
    
    @Override
    public List<CustomerResult> getCustomers(int pageNo, int pageSize, String sortBy) {
        return customerDAO.getCustomers(pageNo, pageSize, sortBy);
    }

    @Override
    public CustomerResult getCustomerById(int id) {
        return customerDAO.getCustomerById(id);
    }

    @Override
    public void createCustomer(Customer customer) {
        customerDAO.createCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer, int id) {
        customerDAO.updateCustomer(customer, id);
    }

    @Override
    public void deleteCustomer(int id) {
        customerDAO.deleteCustomer(id);
    }

    @Override
    public int lastestInput() {
        return customerDAO.lastestInput();
    }
}

