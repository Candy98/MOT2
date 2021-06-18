package com.codingtroops.composesample.model.data

import com.codingtroops.composesample.model.response.FoodCategoriesResponse
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class FoodMenuApi {

    private var service: Service

    init {
        val retrofit: Retrofit = Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(API_URL)
            .build()
        service = retrofit.create(Service::class.java)
    }

    suspend fun getFoodMenu(): FoodCategoriesResponse = service.getMenu()


    interface Service {
        @GET("categories.php")
        suspend fun getMenu(): FoodCategoriesResponse
    }

    companion object {
        const val API_URL = "https://www.themealdb.com/api/json/v1/1/"
    }
}

