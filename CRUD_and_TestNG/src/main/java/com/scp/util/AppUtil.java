package com.scp.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppUtil {
	private static SessionFactory sFactory=null;
	public static SessionFactory getSessionFactory(){
		if(null==sFactory){
			sFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
		}
		
		return sFactory;
	}
	

	public static Session getSession(SessionFactory sessionfactory){
		return sessionfactory.openSession();
	}
	
	public static Transaction getTransaction(Session session){
		return session.beginTransaction();
	}
	public static void flushSession(Session session){
		session.flush();
	}
	public static void commitTransaction(Transaction transaction){
		transaction.commit();
	}

}
	/*public class LazyInitializedSingleton {

	    private static LazyInitializedSingleton instance;
	    
	    private LazyInitializedSingleton(){}
	    
	    public static LazyInitializedSingleton getInstance(){
	        if(instance == null){
	            instance = new LazyInitializedSingleton();
	        }
	        return instance;
	    }
	}*/
	/*@SuppressWarnings("unused")
	public static Session getSession() throws Exception{
		Session session =null;
		if(counter <=MAX_SESSION){
			session = getSessionFactory().openSession();
			counter++;
		}else{
			throw new Exception("No of session limit exceed");
		}
		
		return session;
		

			
	}
	

}
*/

