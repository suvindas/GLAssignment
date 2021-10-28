package com.demo.glassignment.data.repository;



import com.demo.glassignment.data.model.details.PokemonDetails;
import com.demo.glassignment.data.model.profile.Profiles;

import java.util.List;

public interface Repository {
    void getPokemonDetails(String id, LoadPokeDetailsCallback callback);

    interface LoadPokeDetailsCallback {
        void onPokemonDetailsLoaded(PokemonDetails pokemonDetails);

        void onDataNotAvailable();

        void onError();
    }
}
