package com.demo.glassignment.data;


import com.demo.glassignment.data.api.WebApi;
import com.demo.glassignment.data.repository.RemoteDataSource;
import com.demo.glassignment.data.repository.Repository;
import com.demo.glassignment.data.repository.RepositoryImpl;
import com.demo.glassignment.data.service.WebService;

public class DataManager {

    private static DataManager sInstance;

    private DataManager() {
    }

    public static synchronized DataManager getInstance() {
        if (sInstance == null) {
            sInstance = new DataManager();
        }
        return sInstance;
    }

    public Repository getPokeRepository() {
        WebApi webApi = WebService.getInstance().getWebApi();
        RemoteDataSource remoteDataSource = RemoteDataSource.getInstance(webApi);
        return RepositoryImpl.getInstance(remoteDataSource);
    }

}
