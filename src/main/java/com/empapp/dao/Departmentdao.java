package com.empapp.dao;

import com.empapp.dto.Department;

import java.util.List;

public interface Departmentdao {


    void addDept(Department d);

    Department findbyId(Integer id);

    List<Department> findAll();

    void updatedepatment(Department d);

    void deletedepartment(Integer dno);


}
