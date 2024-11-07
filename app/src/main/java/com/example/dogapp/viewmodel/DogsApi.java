package com.example.dogapp.viewmodel;

import com.example.dogapp.model.DogBreed;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface DogsApi {
    @GET("DevTides/DogsApi/master/dogs.json?fbclid=IwY2xjawFi6jRleHRuA2FlbQIxMAABHS5bK1SSRlN-vafjaevpfzCcjemk7mM43kavz1JxwyFBpA7VZIbYEy57Rw_aem_9HyutvYoEGeHAIMNUaUSpA")
    Single<List<DogBreed>> getDogs();


}
