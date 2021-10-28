package com.demo.glassignment.data.repository;


import com.demo.glassignment.data.api.WebApi;
import com.demo.glassignment.data.model.details.PokemonDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RemoteDataSource implements DataSource.Remote {

    private static RemoteDataSource instance;

    private final WebApi mWebApi;

    private RemoteDataSource(WebApi movieApi) {
        this.mWebApi = movieApi;
    }

    public static RemoteDataSource getInstance(WebApi movieApi) {
        if (instance == null) {
            instance = new RemoteDataSource(movieApi);
        }
        return instance;
    }

    @Override
    public void getPokemonDetails(String id, Repository.LoadPokeDetailsCallback callback) {
        mWebApi.getPokemon(id).enqueue(new Callback<PokemonDetails>() {
            @Override
            public void onResponse(Call<PokemonDetails> call, Response<PokemonDetails> response) {
                if (response.body() != null && response.isSuccessful()) {
                    callback.onPokemonDetailsLoaded(response.body());
                } else {
                    callback.onDataNotAvailable();
                }
            }

            @Override
            public void onFailure(Call<PokemonDetails> call, Throwable t) {
                callback.onError();
            }
        });
    }


}
