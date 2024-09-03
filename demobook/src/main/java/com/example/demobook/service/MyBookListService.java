package com.example.demobook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demobook.dao.MyBookListRepository;
import com.example.demobook.model.MyBookList;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBookListRepository mybook;

	public List<MyBookList> getAllMyBooks() {
		// TODO Auto-generated method stub
		return mybook.findAll();
	}

	public void saveMyBooks(MyBookList mb) {
		// TODO Auto-generated method stub
		mybook.save(mb);
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		mybook.deleteById(id);
	}

	
	

}
