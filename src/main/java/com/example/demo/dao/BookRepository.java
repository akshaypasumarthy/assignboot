package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entities.*;

public interface BookRepository extends CrudRepository<Book,Integer> {

	
}
