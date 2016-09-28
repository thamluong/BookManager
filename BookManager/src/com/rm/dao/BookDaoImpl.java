package com.rm.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rm.model.Book;

@Repository
@Transactional
public class BookDaoImpl implements BookDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public void check(){
		List<Book> list = sessionFactory.getCurrentSession().createQuery("from Book").list();
		if(list.size() > 0) System.out.println("Load DB ok:\n"+"name: "+list.get(0).getName());
		else System.out.println("Error connect DB");
		
	}
}
