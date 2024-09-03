package com.example.demobook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demobook.dao.BookRepository;
import com.example.demobook.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookrepo;

	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}

	public void save(Book b) {
		// TODO Auto-generated method stub
		bookrepo.save(b);
	}

	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return bookrepo.findById(id).get();
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		bookrepo.deleteById(id);
	}

	
}
