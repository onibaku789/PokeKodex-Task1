package org.example.pokekodex;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "PokeAPI", url = "https://pokeapi.co/api/v2",configuration = ClientConfiguration.class)
public interface PokeApi {

    @RequestMapping(method = RequestMethod.GET, value = "/pokemon/{id}")
    Pokemon getPokemon(@PathVariable("id") int id);

}
