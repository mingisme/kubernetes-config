package com.example.kubernetesconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class KubernetesConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesConfigApplication.class, args);
	}

}
