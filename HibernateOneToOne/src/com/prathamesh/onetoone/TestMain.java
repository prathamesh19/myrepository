package com.prathamesh.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
public static void main(String[] args) {
	Student s1=new Student(101,"james");
	Student s2=new Student(102,"charles");
	College c1=new College(1001,"oxford",s1);
	College c2=new College(1002,"harward",s2);
	
	
	
	
	Configuration cfg=new Configuration().configure("/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction tr=s.beginTransaction();
    s.save(c1);
    s.save(c2);
	s.flush();
	tr.commit();
}
}
