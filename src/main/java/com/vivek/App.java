package com.vivek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

// @Configuration
// @EnableAutoConfiguration
// @ComponentScan
// @SpringBootApplication
// @EnableScheduling
// public class Application {

//   public static void main(String[] args) {
//       SpringApplication springApplication=new SpringApplication(Application.class);
//       System.out.println("Spring Core Version:- " + SpringVersion.getVersion());
//       springApplication.run(args);

//   }
// }