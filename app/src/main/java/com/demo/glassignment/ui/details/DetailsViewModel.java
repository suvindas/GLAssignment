package com.demo.glassignment.ui.details;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.demo.glassignment.data.model.details.PokemonDetails;
import com.demo.glassignment.data.repository.Repository;
import com.demo.glassignment.ui.base.BaseViewModel;

public class DetailsViewModel extends BaseViewModel {
    private final MutableLiveData<PokemonDetails> mPokeMonDetails = new MutableLiveData<>();
    private final Callback callback = new Callback();
    private Repository mRepository;

    public DetailsViewModel(Repository repository) {
        this.mRepository = repository;
    }

    public void getPokeDetails() {
        setIsLoading(true);
        int min = 1;
        int max = 500;
        int id = (int) (Math.random() * (max - min + 1) + min);
        mRepository.getPokemonDetails(String.valueOf(id), callback);
    }

    /**
     * Callback
     **/
    private class Callback implements Repository.LoadPokeDetailsCallback {
        @Override
        public void onPokemonDetailsLoaded(PokemonDetails pokemonDetails) {
            setIsLoading(false);
            mPokeMonDetails.postValue(pokemonDetails);
        }

        @Override
        public void onDataNotAvailable() {
            setIsLoading(false);
            mShowErrorMessageLiveData.postValue("There is not items!");
        }

        @Override
        public void onError() {
            setIsLoading(false);
            mShowErrorMessageLiveData.postValue("Something Went Wrong!");
        }
    }
    public LiveData<PokemonDetails> getPokeLiveData() {
        return mPokeMonDetails;
    }
}
