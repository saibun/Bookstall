package com.Bookstall.Bookstall.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bookstall.Bookstall.entity.MyBookList;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer>{

}