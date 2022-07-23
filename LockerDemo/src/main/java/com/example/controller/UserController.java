package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.BookLockerDao;
import com.example.Dao.LockerDao;
import com.example.Dao.UserDao;
import com.example.entity.Locker;
import com.example.service.LockerService;

@RestController
@RequestMapping("/v1/app")
public class UserController {

//	User user = new User();
//	Locker locker = new Locker();

	@Autowired
	BookLockerDao bookLocker;

	@Autowired
	UserDao userDao;

	@Autowired
	LockerDao lockerDao;

	@Autowired
	LockerService lockerService;

	@GetMapping("/getAvailableLocker")
	public int availableLocker() {

		List<Locker> count = lockerDao.findAll();

		int lockerFree = -1;
		for (Locker counts : count) {

			if (counts.isAvailable()) {
				lockerFree = counts.getId();
			}

		}

		return lockerFree;

	}

	@PostMapping("/createLocker")
	public int createLocker(@RequestBody RequestBody requestBody) {

		Integer createLocker = -1;
		createLocker = lockerService.createLocker(requestBody);

//		Locker created successfully
		if (createLocker != -1) {
			return createLocker;
		}
//		Locker not created
//		Can throw exception
		return 0;
	}

	@PutMapping("/freeLocker")
	public void freeLocker(@PathVariable Integer lockerId) {

		Integer freeLocker = -1;
		freeLocker = lockerService.freeLocker(lockerId);

		if (freeLocker != -1) {
//			Lock has been released
		} else {
//			Lock hasn't been released 
//			we can throw exception here
		}

	}

}
