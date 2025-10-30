package com.learning.hbn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learning.hbn.configuration.HibernateConfiguration;
import com.learning.hbn.entity.Employee;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("Vakeel Ji","male",98000);
			
		SessionFactory sessionFactory  = HibernateConfiguration.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.persist(emp);
		tx.commit();
	}

}
