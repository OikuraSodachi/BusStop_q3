package com.todokanai.busstop.repository

import com.todokanai.busstop.retrofit.RetrofitRepository

class BusLocationRepository {
    private val repository = RetrofitRepository()

    fun getBusLocation(routeId:String) = repository.getBusLocation(routeId)
}