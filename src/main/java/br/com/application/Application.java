package br.com.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import br.com.repository.EventoRepository;

@SpringBootApplication
@EntityScan(basePackages="br.com.entity")
@ComponentScan(basePackages="br.com.controller")
@EnableJpaRepositories(basePackages="br.com.repository")
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("OK");
	}

	@Autowired
	EventoRepository dao;
	
	@Override
	public void run(String... args) throws Exception {
		//Evento e = new Evento(null,"Viagem",20-10-2020,"19:00","Visitar a familia em Muriaé");
		//dao.save(e); 
	}
	
}
