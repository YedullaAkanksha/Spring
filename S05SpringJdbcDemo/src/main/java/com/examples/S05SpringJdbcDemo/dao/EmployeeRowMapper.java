package com.examples.S05SpringJdbcDemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.examples.S05SpringJdbcDemo.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setId(rs.getInt(1));
		emp.setFirstName(rs.getString("vicky"));
		emp.setLastName(rs.getString("reddy"));
		return emp;
	}

	

}
