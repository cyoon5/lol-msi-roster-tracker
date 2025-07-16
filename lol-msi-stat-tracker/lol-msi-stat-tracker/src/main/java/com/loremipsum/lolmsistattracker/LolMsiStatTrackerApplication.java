package com.loremipsum.lolmsistattracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LolMsiStatTrackerApplication {

	public static void main(String[] args) {

		SpringApplication.run(LolMsiStatTrackerApplication.class, args);
	}


}

