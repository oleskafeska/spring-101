package scheduler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class JavaConfig {

    @Bean
    public ScheduledTask scheduledTask() {
        return new ScheduledTask();
    }
}
