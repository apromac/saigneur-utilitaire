package com.apromac.saigneur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SaigneurUtilitaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaigneurUtilitaireApplication.class, args);
	}

}
