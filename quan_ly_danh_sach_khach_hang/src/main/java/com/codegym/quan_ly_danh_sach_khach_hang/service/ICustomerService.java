package com.codegym.quan_ly_danh_sach_khach_hang.service;


import com.codegym.quan_ly_danh_sach_khach_hang.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}