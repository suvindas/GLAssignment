package com.demo.glassignment.ui.base;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public abstract class BaseViewModel extends ViewModel {
    protected final MutableLiveData<String> mShowErrorMessageLiveData = new MutableLiveData<>();
    protected final MutableLiveData<Void> mShowLoadingLiveData = new MutableLiveData<>();
    protected final MutableLiveData<Void> mHideLoadingLiveData = new MutableLiveData<>();

    protected void setIsLoading(boolean loading) {
        if (loading) {
            mShowLoadingLiveData.postValue(null);
        } else {
            mHideLoadingLiveData.postValue(null);
        }
    }

    /**
     * LiveData
     **/
    public LiveData<Void> getShowLoadingLiveData() {
        return mShowLoadingLiveData;
    }

    public LiveData<String> getShowErrorMessageLiveData() {
        return mShowErrorMessageLiveData;
    }

    public LiveData<Void> getHideLoadingLiveData() {
        return mHideLoadingLiveData;
    }

}
