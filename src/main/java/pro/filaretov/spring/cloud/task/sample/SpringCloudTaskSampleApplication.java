package pro.filaretov.spring.cloud.task.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTaskSampleApplication.class, args);
    }

    @Bean
    public MyTaskApplication myTask() {
        return new MyTaskApplication();
    }
}
