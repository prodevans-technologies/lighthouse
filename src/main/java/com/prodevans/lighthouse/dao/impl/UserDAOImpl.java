package com.prodevans.lighthouse.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.prodevans.lighthouse.dao.UserDAO;
import com.prodevans.lighthouse.dao.mapper.UserMapper;
import com.prodevans.lighthouse.pojo.UserDetails;

public class UserDAOImpl implements UserDAO {
	 private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	@Override
	public List<UserDetails> getUsers() {
		  String SQL = "select * from user";
		  List<UserDetails> users = jdbcTemplateObject.query(SQL, new UserMapper());
		return users;
	}
	   
	   
}
