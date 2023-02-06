package com.todokanai.busstop.room.retrofitdata

data class ThroughLine(
    // retrofit.busstation.throughline
    val endnodenm: String,
    val routeid: String,
    val routeno: Int,
    val routetp: String,
    val startnodenm: String
)
