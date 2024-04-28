package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Messages;

public interface MessagesRepository extends JpaRepository<Messages, Long> {

}
