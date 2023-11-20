package com.example.demo_1027.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_1027.entity.Atm;

@Repository
public interface AtmDao extends JpaRepository<Atm, String>{

}
