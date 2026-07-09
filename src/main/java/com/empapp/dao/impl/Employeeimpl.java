package com.empapp.dao.impl;

import com.empapp.dao.Employeedao;
import com.empapp.dto.Department;
import com.empapp.dto.Employee;
import com.empapp.utlity.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Employeeimpl implements Employeedao {

    private Connection con;

    public Employeeimpl(){
        this.con=Connector.requestConnection();
    }

    @Override
    public void addemployee(Employee e) {
        String query = "INSERT INTO employee VALUES (0,?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, e.getName());
            ps.setString(2, e.getJob());
            ps.setDouble(3, e.getSalary());
            ps.setInt(4, e.getDno());
            ps.setString(5, e.getEmail());
            ps.setString(6, e.getPass());

            ps.executeUpdate();
            System.out.println(" row inserted");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Employee findById(Integer id) {
        String query = "SELECT * FROM employee WHERE id=?";
        Employee e = null;

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {  // only one record expected
                e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setJob(rs.getString("job"));
                e.setSalary(rs.getDouble("salary"));
                e.setDno(rs.getInt("dno"));
                e.setEmail(rs.getString("email"));
                e.setPass(rs.getString("pass"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return e;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> list = new ArrayList<>();
        Employee e =null;
        String query = "SELECT * FROM employee";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {  // only one record expected
                e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setJob(rs.getString("job"));
                e.setSalary(rs.getDouble("salary"));
                e.setDno(rs.getInt("dno"));
                e.setEmail(rs.getString("email"));
                e.setPass(rs.getString("pass"));

                list.add(e);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public Employee findEmailAndPassword(String Email, String Pass) {
        String query = "SELECT * FROM employee WHERE email=? AND pass=?";
        Employee e = null;
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1,Email);
            ps.setString(2,Pass);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {  // only one record expected
                e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setJob(rs.getString("job"));
                e.setSalary(rs.getDouble("salary"));
                e.setDno(rs.getInt("dno"));
                e.setEmail(rs.getString("email"));
                e.setPass(rs.getString("pass"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return e;
    }

    @Override
    public void updateEmployee(Employee e) {
        String query="update employee set name =?,job=?,salary=? ,dno=?,email=? ,pass=? where id=? ";

        try {
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, e.getName());
            ps.setString(2, e.getJob());
            ps.setDouble(3, e.getSalary());
            ps.setInt(4, e.getDno());
            ps.setString(5, e.getEmail());
            ps.setString(6, e.getPass());
            ps.setInt(7, e.getId());

            ps.executeUpdate();

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(Integer dno) {
        String query = "DELETE FROM employee WHERE dno=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, dno);
            ps.executeUpdate();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

	@Override
	public Employee findByEmail(String Email) {
		String query = "SELECT * FROM employee WHERE email=? ";
        Employee e = null;
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1,Email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {  // only one record expected
                e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setJob(rs.getString("job"));
                e.setSalary(rs.getDouble("salary"));
                e.setDno(rs.getInt("dno"));
                e.setEmail(rs.getString("email"));
                e.setPass(rs.getString("pass"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return e;
	}
}
