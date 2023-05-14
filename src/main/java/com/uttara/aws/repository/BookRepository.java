package com.uttara.aws.repository;

import com.uttara.aws.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book,Integer> {

}
