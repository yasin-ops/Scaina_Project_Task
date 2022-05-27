package com.profischnell.scaniaproject.retrofit

import com.profischnell.scaniaproject.data.CountryDataItem
import retrofit2.Call
import retrofit2.http.GET

interface RetroServiceIInterface {

    @GET("all")
    fun getCountryList(): Call<List<CountryDataItem>>

}