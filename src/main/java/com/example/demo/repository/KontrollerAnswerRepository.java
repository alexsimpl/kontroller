package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Answer.KontrollerAnswerEntity;

public interface KontrollerAnswerRepository extends JpaRepository<KontrollerAnswerEntity, Long> {

}
