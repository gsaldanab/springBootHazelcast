package com.geo.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CounterService {
	
	@Autowired
	private CacheManager cacheManager;

	@Cacheable(value="count", key="#c")
	public int getCount(String c) {
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        return 0;
	}
	
	@CachePut(value = "count", key="#c")
	public int addUnit(String c) {
		ValueWrapper cacheValue = cacheManager.getCache("count").get(c);
		int current = cacheValue != null ? (Integer)cacheValue.get():20;
		return current +1;
	}

}
