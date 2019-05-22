package com.srmasset.cepconsultservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Victor Kody
 *
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class CepConsultServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(CepConsultServiceApplication.class, args);
	}

}
