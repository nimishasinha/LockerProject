package com.example.service;

import org.springframework.web.bind.annotation.RequestBody;

public interface LockerService {

	Integer createLocker(RequestBody request);
	
	Integer freeLocker(int lockerId);
	
	
}
