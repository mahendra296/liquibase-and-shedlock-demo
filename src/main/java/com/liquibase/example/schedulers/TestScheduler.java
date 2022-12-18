package com.liquibase.example.schedulers;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestScheduler {

    @Scheduled(cron = "* 0/1 * * * *")
    @SchedulerLock(name = "createAndCancelOrderInQuickGet", lockAtLeastFor = "2m", lockAtMostFor = "2m")
    public void test() {
        log.info("Test Scheduler");
    }
}
