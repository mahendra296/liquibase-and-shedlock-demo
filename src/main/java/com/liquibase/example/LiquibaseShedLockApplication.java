package com.liquibase.example;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "5m", defaultLockAtLeastFor = "1m")
public class LiquibaseShedlockApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiquibaseShedlockApplication.class, args);
	}

}
