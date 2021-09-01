package pro.filaretov.spring.cloud.task.sample;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class MyTaskApplication implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Starting the task...");

        Thread.sleep(10000);

        System.out.println("Task complete");
    }
}
