package com.ps.ramsey;

import com.ps.ramsey.solution.Solver;
import com.ps.ramsey.input.Input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Main Entry Point of the Application
 */
@Configuration
@ComponentScan
public class Application implements CommandLineRunner {

    @Autowired
    private Solver solver;

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(Application.class);
        application.setWebEnvironment(false);
        application.setLogStartupInfo(false);
        application.run(args);

    }


    private int solution(InputStream inputStream) {

        Input input = Input.parse(inputStream);
        return solver.solve(input);
    }

    @Override
    public void run(String... files) throws Exception {

        if (files.length >= 1) {

            for (String file : files) {

                InputStream stream = new FileInputStream(file);
                int value = solution(stream);
                System.out.println(String.format("%s : %d", file, value));
                stream.close();
            }

        } else {

            System.out.println("\n\nProvide input here:\n");
            int value = solution(System.in);
            System.out.println(value);

        }
    }
}
