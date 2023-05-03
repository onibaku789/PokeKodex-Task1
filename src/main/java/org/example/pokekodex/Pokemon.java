package org.example.pokekodex;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value.Immutable
@Value.Style(overshadowImplementation = true)
@JsonDeserialize(as = ImmutablePokemon.class)
public interface Pokemon {
    String name();
}
