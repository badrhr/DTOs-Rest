package org.xproce.demosoap;

import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xproce.demosoap.dao.entities.Compte;
import org.xproce.demosoap.dao.repositories.CompteRepository;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemosoapApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemosoapApplication.class, args);
    }


    @Bean
    public CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
            compteRepository.saveAll(
                    List.of(
                            new Compte(null, 314684, new Date(), "6468797fdg797", ""),
                            new Compte(null, 3484, new Date(), "6464ref64",""),
                            new Compte(null, 648464, new Date(), "564h64erw",""),
                            new Compte(null, 87884668, new Date(), "64hg6eqw46h8g","")
                    )
            );
        };
    }
}