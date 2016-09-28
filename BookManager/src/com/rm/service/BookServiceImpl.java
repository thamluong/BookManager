package com.rm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.dao.BookDao;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookDao bookDao;
	
	@Override
	public void check(){
		bookDao.check();
	}
}
