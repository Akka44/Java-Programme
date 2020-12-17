package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		 Configuration cf=new Configuration();
		   cf.configure("configuration.xml");
		   SessionFactory sf=cf.buildSessionFactory();
		   Session se=sf.openSession();
		  
		   Transaction tx=se.beginTransaction();
		   Student x=(Student)se.load(Student.class,24);
		   x.setMarks(456);
		   se.update(x);
		   tx.commit();
		   se.close();
		   sf.close();
	}
}
