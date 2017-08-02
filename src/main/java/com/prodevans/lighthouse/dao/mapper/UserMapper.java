package com.prodevans.lighthouse.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.prodevans.lighthouse.pojo.UserDetails;

public class UserMapper implements RowMapper<UserDetails> {

	@Override
	public UserDetails mapRow(ResultSet rs, int no) throws SQLException {
		UserDetails user= new UserDetails();
		user.setUser_id(Integer.parseInt(rs.getString("user_id")));
		user.setUser_name(rs.getString("user_name"));
		user.setPassword(rs.getString("password"));
		user.setDesc(rs.getString("desc"));
		return user;
	}

}
