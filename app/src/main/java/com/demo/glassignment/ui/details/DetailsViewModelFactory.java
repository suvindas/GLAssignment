package com.demo.glassignment.ui.details;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.demo.glassignment.data.repository.Repository;

public class DetailsViewModelFactory implements ViewModelProvider.Factory{
    private final Repository repository;

    public DetailsViewModelFactory(Repository repository) {
        this.repository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(DetailsViewModel.class)) {
            return (T) new DetailsViewModel(repository);
        }

        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}