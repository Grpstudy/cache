package com.springboot.ehcache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.springboot.ehcache.domain.Student;

@Service
public class CacheService {
	Student student;
	
	@Cacheable(value="student")
	public Object checkCache(Integer id) throws InterruptedException{
		System.out.println(student);
		
		Thread.sleep(10 * 1000);
		System.out.println("Collecting from From db");
		student = new Student();
		student.setId(id);;
		student.setName("Dimple");
		student.setRegdNo("0801213210");
		return student;
	}
}
