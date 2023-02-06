package com.todokanai.busstop.retrofit.busarrive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/todokanai/busstop/retrofit/busarrive/BusArriveService;", "", "getStationArrive", "Lretrofit2/Call;", "Lcom/todokanai/busstop/retrofit/busarrive/stationlist/BusArriveResponse;", "nodeId", "", "app_debug"})
public abstract interface BusArriveService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getSttnAcctoArvlPrearngeInfoList?serviceKey=7TU9szuK95yGTs7ptoWbuUKFk4S%2B4Q%2BAbOn1a4qImHQKSx2AgIdPxF7fG%2B2cgVIR8zD3fWwSWD8rTNV3cr2hsQ%3D%3D&pageNo=1&numOfRows=10&_type=json&cityCode=38030")
    public abstract retrofit2.Call<com.todokanai.busstop.retrofit.busarrive.stationlist.BusArriveResponse> getStationArrive(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "nodeId")
    java.lang.String nodeId);
}