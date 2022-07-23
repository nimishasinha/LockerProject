package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Locker;

public interface LockerDao extends JpaRepository<Locker, Integer> {

}
