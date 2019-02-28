package com.prathamesh.hibernateutilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sFactory;
	private static Session session;
	private static Transaction transaction;
	public static SessionFactory getSessionFactory(){
		if(sFactory==null){
			synchronized (HibernateUtil.class) {
		
				if(sFactory==null){
					sFactory=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
				}
			}
		}
		
		return sFactory;
	}
	
	public static Session getSession(SessionFactory sf){
		
		if(session==null){
			session=sFactory.openSession();
		}
		return session;
	}
	
	public static Transaction getTransaction(Session session){
		if(transaction==null){
			transaction=session.beginTransaction();
		}
		return transaction;
	}

	public static void flushNCommit(){
		if(session!=null && transaction!=null){
			session.flush();
			transaction.commit();
		}
          return;		
	}
}
