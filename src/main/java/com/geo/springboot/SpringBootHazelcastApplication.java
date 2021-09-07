package com.geo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.spring.cache.HazelcastCacheManager;

@SpringBootApplication
@EnableCaching
public class SpringBootHazelcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHazelcastApplication.class, args);
	}

	@Bean
	CacheManager cacheManager() {
	    return new HazelcastCacheManager(Hazelcast.newHazelcastInstance());
	}
}
