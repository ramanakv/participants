package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeDbService implements EmployeeService {

	@Override
	public String getType() {
		return "PERM";
	}
	
	Connection con;
	public EmployeeDbService() {
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "postgres");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Override
	public Employee getEmployee(int id) {
		try {
		 	PreparedStatement pst = con.prepareStatement("select * from employee where empid =?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				Employee e = new Employee(id, rs.getString(2), rs.getFloat(3));
				return e;

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean saveEmployee(Employee e) {
		try {
			PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?)");
			pst.setInt(1, e.getEmpId());
			pst.setString(2, e.getName());
			pst.setFloat(3, e.getSalary());

			 pst.executeUpdate();

			return true;

		} catch (Exception ex) {
			// TODO Auto-generated catch block
		//	ex.printStackTrace();
			return false;
		}
	}

}
