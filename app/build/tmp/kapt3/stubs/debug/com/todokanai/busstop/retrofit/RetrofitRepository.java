package com.todokanai.busstop.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\nJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\n2\u0006\u0010\u0012\u001a\u00020\u000fJ\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\n2\u0006\u0010\u0012\u001a\u00020\u000fR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/todokanai/busstop/retrofit/RetrofitRepository;", "", "()V", "arriveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/todokanai/busstop/room/retrofitdata/BusArrive;", "getArriveData", "()Landroidx/lifecycle/MutableLiveData;", "getAllStation", "Lkotlinx/coroutines/flow/Flow;", "Lcom/todokanai/busstop/room/retrofitdata/Station;", "getBusArrive", "", "nodeId", "", "getBusLocation", "Lcom/todokanai/busstop/room/retrofitdata/BusLocation;", "routeId", "getThroughLine", "Lcom/todokanai/busstop/room/retrofitdata/ThroughLine;", "getThroughStation", "Lcom/todokanai/busstop/room/retrofitdata/ThroughStation;", "app_debug"})
public final class RetrofitRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.todokanai.busstop.room.retrofitdata.BusArrive>> arriveData = null;
    
    public RetrofitRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.todokanai.busstop.room.retrofitdata.BusArrive>> getArriveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.todokanai.busstop.room.retrofitdata.Station>> getAllStation() {
        return null;
    }
    
    public final void getBusArrive(@org.jetbrains.annotations.NotNull()
    java.lang.String nodeId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.todokanai.busstop.room.retrofitdata.BusLocation>> getBusLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String routeId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.todokanai.busstop.room.retrofitdata.ThroughLine>> getThroughLine(@org.jetbrains.annotations.NotNull()
    java.lang.String nodeId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.todokanai.busstop.room.retrofitdata.ThroughStation>> getThroughStation(@org.jetbrains.annotations.NotNull()
    java.lang.String routeId) {
        return null;
    }
}