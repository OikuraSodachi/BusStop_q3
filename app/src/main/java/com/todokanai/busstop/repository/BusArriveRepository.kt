package com.todokanai.busstop.repository

import com.todokanai.busstop.retrofit.RetrofitRepository

class BusArriveRepository {
    private val repository = RetrofitRepository()

    val arriveData = repository.arriveData

    fun getArrive(nodeId: String) = repository.getBusArrive(nodeId)

}