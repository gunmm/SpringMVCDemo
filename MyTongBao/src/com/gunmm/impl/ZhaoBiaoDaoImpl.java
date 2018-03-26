package com.gunmm.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gunmm.dao.ZhaoBiaoDao;
import com.gunmm.db.MyHibernateSessionFactory;
import com.gunmm.model.ZhaoBiao;

public class ZhaoBiaoDaoImpl implements ZhaoBiaoDao {

	@Override
	public String addZhaoBiao(ZhaoBiao zbModel) {
		// TODO Auto-generated method stub
		zbModel.setPublishId(UUID.randomUUID().toString());
		zbModel.setId(3);
		zbModel.setCreateTime(new Date());
		Transaction tx = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			session.save(zbModel);
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

	@Override
	public boolean deleteZhaoBiao(ZhaoBiao zbModel) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	//获取id
	private String getNewPublishId() {
		Transaction tx = null;
		String publishId = null;
		String hql = "";
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			tx = session.beginTransaction();
			hql = "select max(publishId) from ZhaoBiao";
			Query query = session.createQuery(hql);
			publishId = (String) query.uniqueResult();
			if (publishId == null || "".equals(publishId)) {
				publishId = "P0000001";
			} else {
				String temp = publishId.substring(1);
				int i = Integer.parseInt(temp);
				i++;
				temp = String.valueOf(i);
				int length = temp.length();
				for (int j = 0; j < 7 - length; j++) {
					temp = "0" + temp;
				}
				temp = "P" + temp;
				publishId = temp;
			}
			tx.commit();
			return publishId;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			if (tx != null) {
				tx = null;
			}
		}

	}

}
