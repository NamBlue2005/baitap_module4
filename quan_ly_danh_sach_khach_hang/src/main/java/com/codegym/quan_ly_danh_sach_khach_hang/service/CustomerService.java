package com.codegym.quan_ly_danh_sach_khach_hang.service;

import com.codegym.quan_ly_danh_sach_khach_hang.model.Customer;
import com.codegym.quan_ly_danh_sach_khach_hang.repository.CustomerRepository;
import com.codegym.quan_ly_danh_sach_khach_hang.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}