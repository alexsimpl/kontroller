package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.EventsEntity;

public interface EventsRepository extends JpaRepository<EventsEntity, Long> {
    EventsEntity findById(long id);
}
