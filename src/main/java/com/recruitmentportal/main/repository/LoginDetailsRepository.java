package com.recruitmentportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.recruitmentportal.main.pojo.LoginDetails;

@Repository
public class LoginDetailsRepository implements LoginDetailsRepositoryInterface {

	private static final String VALIDATE_USER = "SELECT * FROM login_details WHERE login_id=? and password=?";
	private static final String GETALLEMPLOYEE = "SELECT * FROM login_details";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public LoginDetails loginUser(LoginDetails logindetails) {
		System.out.println(logindetails);
		LoginRowMapper loginRowMapper = new LoginRowMapper();
		Object[] args = { logindetails.getLoginId(), logindetails.getPassword() };
		LoginDetails details = jdbcTemplate.queryForObject(VALIDATE_USER, loginRowMapper, args);
		return details;
	}

	public List<LoginDetails> allEmployee() {
		// TODO Auto-generated method stub
		LoginRowMapper loginRowMapper = new LoginRowMapper();
		List<LoginDetails> query = jdbcTemplate.query(GETALLEMPLOYEE, loginRowMapper);
		return query;
	}

}
