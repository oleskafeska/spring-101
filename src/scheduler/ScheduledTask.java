package scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ScheduledTask {

    @Autowired
    @Scheduled(cron = "* * * * * *")
    public void reportCurrentTime() {
        System.out.println("Now is:  " + LocalDateTime.now());
    }
}
