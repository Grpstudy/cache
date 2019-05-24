package com.springboot.ehcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ehcache.domain.Student;
import com.springboot.ehcache.service.CacheService;

@RestController
@RequestMapping("/cache")
public class CacheController {

	@Autowired
	CacheService service;
	
	@RequestMapping(value = "/check/{ids}/", method = RequestMethod.GET)
	public Object checkCache(@PathVariable(value="ids") String id) throws InterruptedException {
		int ids = Integer.parseInt(id);
		Object object = service.checkCache(ids);
		System.out.println("insdie controller" + (Student) object);
		return object;
	}
}
