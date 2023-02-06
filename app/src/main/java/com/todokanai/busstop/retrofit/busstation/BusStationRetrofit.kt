package com.todokanai.busstop.retrofit.busstation

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BusStationRetrofit {

    val BASE_URL = "http://apis.data.go.kr/1613000/BusSttnInfoInqireService/"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}