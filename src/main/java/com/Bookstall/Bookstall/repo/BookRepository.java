package com.Bookstall.Bookstall.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bookstall.Bookstall.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
