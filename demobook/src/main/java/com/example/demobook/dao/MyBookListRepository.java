package com.example.demobook.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demobook.model.MyBookList;

@Repository
public interface MyBookListRepository extends JpaRepository <MyBookList, Integer> {

}
