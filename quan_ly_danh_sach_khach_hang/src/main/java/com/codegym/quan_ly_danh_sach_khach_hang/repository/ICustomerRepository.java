package com.codegym.quan_ly_danh_sach_khach_hang.repository;

import com.codegym.quan_ly_danh_sach_khach_hang.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}