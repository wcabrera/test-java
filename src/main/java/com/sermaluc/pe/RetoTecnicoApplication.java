package com.sermaluc.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@EntityScan(basePackages = {"com.sermaluc.pe.entities"})
//@EnableJpaRepositories(basePackages = {"com.sermaluc.pe.repository"})
public class RetoTecnicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoTecnicoApplication.class, args);
	}

}
