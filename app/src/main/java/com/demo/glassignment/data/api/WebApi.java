package com.demo.glassignment.data.api;



import com.demo.glassignment.data.model.details.PokemonDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WebApi {
    @GET("pokemon/{id}")
    Call<PokemonDetails> getPokemon(@Path("id") String id);
}
