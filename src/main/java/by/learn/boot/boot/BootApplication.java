package by.learn.boot.boot;

import by.learn.boot.boot.action.CalcAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.Scanner;

@SpringBootApplication
public class BootApplication implements CommandLineRunner {

    @Autowired
    private CalcAction calcAction;

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        boolean flag = true;
        while (flag) {
            calcAction.execute();
            System.out.println("For exit enter: e. Continue - any other character");
            Scanner scanner = new Scanner(System.in);
            if (scanner.next().equalsIgnoreCase("e")) {
                flag = false;
            }
        }
    }
}
