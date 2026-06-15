package edu.tstc.autoshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The starting point of the web app.
 *
 * Running this starts a small web server (http://localhost:8080) that serves
 * the welcome page in src/main/resources/static/. Run it with:
 *
 *     mvn spring-boot:run
 *
 * Right now it just shows a welcome page — proof your app runs on the web.
 * In the next modules we'll add real data, rules, a database, and more.
 */
@SpringBootApplication
public class AutoShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoShopApplication.class, args);
    }
}
