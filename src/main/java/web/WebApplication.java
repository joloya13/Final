package web;

/************************************************************************************
 * @file WebApplication.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/************************************************************************************
 * This class contains the driver for running running all web pages and applications.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

@SpringBootApplication
public class WebApplication {

    /**
     * The main driver method for the class.
     *
     * @param args Arguments to be passed in from the command line.
     */

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
} // WebApplication
