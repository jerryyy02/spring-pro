package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.bean.Login;
import com.cts.product.dao.LoginDAO;
import com.cts.product.dao.LoginDAOImpl;

@Service("LoginService")
public class LoginServiseImpl implements LoginService {
	
	@Autowired
	LoginDAO loginDAO = new LoginDAOImpl();

	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return loginDAO.authenticate(userName, password);
	}

}
