package com.profischnell.scaniaproject.viewmodel


import android.util.Log

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.profischnell.scaniaproject.data.CountryDataItem
import com.profischnell.scaniaproject.retrofit.RetroInstance
import com.profischnell.scaniaproject.retrofit.RetroServiceIInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityViewModel : ViewModel() {


    var liveDataList: MutableLiveData<List<CountryDataItem>> = MutableLiveData()

    fun makeAPICall() {
        val retroInstance = RetroInstance.getRetroInstance()
        val retroServies = retroInstance.create(RetroServiceIInterface::class.java)
        val call = retroServies.getCountryList()
        call.enqueue(object : Callback<List<CountryDataItem>> {
            override fun onFailure(call: Call<List<CountryDataItem>>, t: Throwable) {

                Log.e("Yaseen", "Error" + t.message)
                liveDataList.postValue(null)
            }

            override fun onResponse(
                call: Call<List<CountryDataItem>>,
                response: Response<List<CountryDataItem>>
            ) {

                Log.e("Yaseen", "succes" + response.body())
                liveDataList.postValue(response.body())
            }
        })


    }

    fun getLiveDataObserver(): MutableLiveData<List<CountryDataItem>> {
        return liveDataList
    }


}