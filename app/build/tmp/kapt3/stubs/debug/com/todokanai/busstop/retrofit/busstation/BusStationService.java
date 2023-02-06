package com.todokanai.busstop.retrofit.busstation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/todokanai/busstop/retrofit/busstation/BusStationService;", "", "getBus", "Lretrofit2/Call;", "Lcom/todokanai/busstop/retrofit/busstation/stationlist/BusStationResponse;", "getThroughLine", "Lcom/todokanai/busstop/retrofit/busstation/throughline/ThroughLineResponse;", "nodeId", "", "app_debug"})
public abstract interface BusStationService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getSttnNoList?serviceKey=7TU9szuK95yGTs7ptoWbuUKFk4S%2B4Q%2BAbOn1a4qImHQKSx2AgIdPxF7fG%2B2cgVIR8zD3fWwSWD8rTNV3cr2hsQ%3D%3D&_type=json&cityCode=38030&numOfRows=3000")
    public abstract retrofit2.Call<com.todokanai.busstop.retrofit.busstation.stationlist.BusStationResponse> getBus();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getSttnThrghRouteList?serviceKey=7TU9szuK95yGTs7ptoWbuUKFk4S%2B4Q%2BAbOn1a4qImHQKSx2AgIdPxF7fG%2B2cgVIR8zD3fWwSWD8rTNV3cr2hsQ%3D%3D&pageNo=1&numOfRows=50&_type=json&cityCode=38030")
    public abstract retrofit2.Call<com.todokanai.busstop.retrofit.busstation.throughline.ThroughLineResponse> getThroughLine(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "nodeId")
    java.lang.String nodeId);
}