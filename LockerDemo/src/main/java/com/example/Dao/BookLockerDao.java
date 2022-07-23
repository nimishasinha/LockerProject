package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.BookLocker;

public interface BookLockerDao extends JpaRepository<BookLocker, Integer> {

}
