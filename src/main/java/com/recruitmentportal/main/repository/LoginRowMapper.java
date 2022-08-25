package com.recruitmentportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.recruitmentportal.main.pojo.LoginDetails;

public class LoginRowMapper implements RowMapper<LoginDetails> {

	@Override
	public LoginDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		LoginDetails loginDetails = new LoginDetails();
		String login_Id = rs.getString("login_id");
		String password = rs.getString("password");
		String designation = rs.getString("designation");

		loginDetails.setLoginId(login_Id);
		loginDetails.setPassword(password);
		loginDetails.setDesignation(designation);
		return loginDetails;
	}

}
