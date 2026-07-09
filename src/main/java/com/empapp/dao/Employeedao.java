package com.empapp.dao;

import com.empapp.dto.Employee;

import java.util.List;

public interface Employeedao {

        void addemployee(Employee e);
        Employee findById(Integer id);
        List<Employee> findAll();
        Employee findEmailAndPassword(String Email, String Password);
        Employee findByEmail(String Email);
        void updateEmployee(Employee e);
        void deleteEmployee(Integer dno);
    }

