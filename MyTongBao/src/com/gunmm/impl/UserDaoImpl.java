package com.gunmm.impl;

import java.util.Date;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gunmm.dao.UserDao;
import com.gunmm.db.MyHibernateSessionFactory;
import com.gunmm.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		user.setUserId(UUID.randomUUID().toString()); 
		user.setCreateTime(new Date());
		Transaction tx = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getCause().getMessage();
		} finally {
			if (tx != null) {
				tx = null;
			}
		}
	}

}
