package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MergeEx {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student s=new Student();
		s.setId(46);
		s.setMarks(789);
		s.setName("akki");
		s=(Student)se.merge(s);//but it's return type is an object
		tx.commit();
		System.out.println(s.getName()+" "+s.getMarks());
		se.close();
		sf.close();

	}

}
