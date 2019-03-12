package com.cts.product.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cts.product.bean.Login;

@Repository("LoginDAO")
public class LoginDAOImpl implements LoginDAO {

	/*@Autowired
	private SessionFactory sessionFactory;*/
	
	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		/*org.hibernate.Session session = null;
		String query = "from Login where userName=? and password=?";
		org.hibernate.query.Query<Login> query2 = null;
		try {
			session = sessionFactory.getCurrentSession();
			query2 = session.createQuery(query);
			query2.getParameter(userName);
			query2.getParameter(password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(session!=null){
				session.close();
			}
		}*/
		return null;
	}

}
