package org.example.pokekodex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PokekodexApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(PokekodexApplication.class, args);
    }

    @Autowired
    private PokeApi pokeApi;

    public void run(String... args) {
        Pokemon pokemon = pokeApi.getPokemon(1);
        System.out.println(pokemon);
        System.exit(0);
    }
}
