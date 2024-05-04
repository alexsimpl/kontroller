package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.KontrollerEntity;

public interface KontrollerRepository extends JpaRepository<KontrollerEntity, Long> {

    KontrollerEntity findBySn(String sn);
}
