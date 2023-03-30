package com.examples.S05SpringJdbcDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.S05SpringJdbcDemo.entity.Employee;

@Component("employeedao")
public class EmployeeDaoImp implements EmployeeDAO {
	@Autowired
		private JdbcTemplate jt;
		
		@Override
		public int create(Employee employee) {
			  String sql="insert into employee values(?,?,?)";
		        int res=jt.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());
		        return res;
		}

		@Override
		public int update(Employee emp) {
			String sql="update employee set FirstName=?,LastName=? where Id=?";
	        int res=jt.update(sql,emp.getId(),emp.getFirstName(),emp.getLastName());
	        return res;
		}

		@Override
		public int delete(int id) {
			String sql="delete from employee where id=?";
	        int res=jt.update(sql,id);
	        return res;
		}

		@Override
		public Employee read(int id) {
			String sql="Select * from employee where id=?";
			EmployeeRowMapper erm= new EmployeeRowMapper();
			Employee emp=jt.queryForObject(sql,erm,id);
			return emp;
		}

		@Override
		public List<Employee> read() {
			// TODO Auto-generated method stub
			String sql="Select * from employee";
			EmployeeRowMapper erm= new EmployeeRowMapper();
			 List<Employee> emp=jt.query(sql,erm);
			return emp;
		}
		
	}


