package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.MessagesAnswerEntity;
import com.example.demo.Entity.MessagesEntity;


public interface MessagesAnswerRepository extends JpaRepository<MessagesAnswerEntity, Long> {
     MessagesEntity findById(long id);
}
