package com.bosicloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AwsmidRegistry {

	public static void main(String[] args) {
		new SpringApplicationBuilder(AwsmidRegistry.class).web(true).run(args);
	}

}
