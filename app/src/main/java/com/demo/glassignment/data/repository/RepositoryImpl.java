package com.demo.glassignment.data.repository;


import com.demo.glassignment.data.model.details.PokemonDetails;
import com.demo.glassignment.data.model.profile.Profiles;

import java.util.List;

public class RepositoryImpl implements Repository {

    private static RepositoryImpl instance;
    private final DataSource.Remote remote;

    private RepositoryImpl(RemoteDataSource remote) {
        this.remote = remote;
    }

    public static RepositoryImpl getInstance(RemoteDataSource remoteDataSource) {
        if (instance == null) {
            instance = new RepositoryImpl(remoteDataSource);
        }
        return instance;
    }

    @Override
    public void getPokemonDetails(String id, LoadPokeDetailsCallback callback) {
        remote.getPokemonDetails(id, new LoadPokeDetailsCallback() {
            @Override
            public void onPokemonDetailsLoaded(PokemonDetails pokemonDetails) {
                callback.onPokemonDetailsLoaded(pokemonDetails);
            }

            @Override
            public void onDataNotAvailable() {
                callback.onDataNotAvailable();
            }

            @Override
            public void onError() {
                callback.onError();
            }
        });
    }
}
