package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Recharge;

import com.model.*;

public class RechargeDao implements InterfaceRechargeDao{

	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveRecharge(Recharge r){  
	    String query="insert into recharge_log values("+r.getPhoneNo()+","+r.getAmount()+",'"+r.getOperator()+"')";  
	    return jdbcTemplate.update(query);  
	}  
		
	public int updateRecharge(Recharge r, int amount){  
		String query = "update recharge set amount=? where phone_no=?";
				return jdbcTemplate.update(query,amount-r.getAmount(),r.getPhoneNo());  
	}
	
	public int findAmount(long l) {
        String query = "select amount from recharge where phone_no=?"; 
        Object[] inputs = new Object[] {l};
        int amount = jdbcTemplate.queryForObject(query, inputs, Integer.class);
        return amount;
    }
	public List<Recharge> getTransaction(Recharge p){  
	    return jdbcTemplate.query("select * from recharge_log ",new RowMapper<Recharge>(){  
	        public Recharge mapRow(ResultSet rs, int row) throws SQLException {  
	            Recharge p=new Recharge(); 
	            
	            p.setPhoneNo(rs.getLong(1));         
	            p.setAmount(rs.getInt(2));
	            
	            
	            return p;  
	        }  
	    });  
	}

	//where phone_no="+p.getPhoneNo()+"
	//p.setOperator(rs.getString(3));
}
