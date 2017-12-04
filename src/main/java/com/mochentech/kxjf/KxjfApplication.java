package com.mochentech.kxjf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class KxjfApplication {

	protected final static Logger logger = LoggerFactory.getLogger(KxjfApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(KxjfApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
//		SpringApplication.run(Application.class, args);
		logger.info("PortalApplication is success!");
		System.err.println("sample started. http://localhost/");
	}
}
