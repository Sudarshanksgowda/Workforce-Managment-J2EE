package com.empapp.dao.impl;

import com.empapp.dao.Departmentdao;
import com.empapp.dto.Department;
import com.empapp.utlity.Connector;

import java.sql.Connection;
import java.util.List;

public class Departmentimpl implements Departmentdao {

private Connection con;
//    Declares a variable to store database connection

public Departmentimpl(){
        this.con=Connector.requestConnection();
}
    @Override
    public void addDept(Department d) {

    }

    @Override
    public Department findbyId(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return List.of();
    }

    @Override
    public void updatedepatment(Department d) {

    }

    @Override
    public void deletedepartment(Integer dno) {

    }
}
