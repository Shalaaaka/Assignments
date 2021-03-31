package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;    
import com.example.model.Emp;

public class EmpDao 
{
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
	public int save(Emp emp)
	{    
	    String sql="insert into Employee(name,department,designation,salary) values('"+emp.getName()+"',"+emp.getDepartment()+",'"+emp.getDesignation()+"','"+emp.getSalary()+"')";    
	    return template.update(sql);    
	}    
	
	public int update(Emp emp)
	{    
	    String sql="update Employee set name='"+emp.getName()+"',department='"+emp.getDepartment()+"', designation="+emp.getDesignation()+",salary='"+emp.getSalary()+"' where id="+emp.getId()+"";    
	    return template.update(sql);    
	}    
	
	public int delete(int id)
	{    
	    String sql="delete from Employee where id="+id+"";    
	    return template.update(sql);    
	}    
	
	public Emp getEmpById(int id)
	{    
	    String sql="select * from Employee where id=?";    
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));    
	}   
	
	public List<Emp> getEmployees(){    
	    return template.query("select * from Employee",new RowMapper<Emp>()
	    {    
	        public Emp mapRow(ResultSet rs, int row) throws SQLException 
	        {    
	            Emp emp=new Emp();    
	            emp.setId(rs.getInt(1));    
	            emp.setName(rs.getString(2));
	            emp.setDepartment(rs.getString(3));
	            emp.setDesignation(rs.getString(4)); 
	            emp.setSalary(rs.getString(5));
	            return emp;    
	        }    
	    });    
	}    
}
