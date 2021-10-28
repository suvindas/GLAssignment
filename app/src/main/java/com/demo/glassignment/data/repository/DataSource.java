package com.demo.glassignment.data.repository;



public interface DataSource {

    interface Remote {
        void getPokemonDetails(String id, Repository.LoadPokeDetailsCallback callback);
    }
}
