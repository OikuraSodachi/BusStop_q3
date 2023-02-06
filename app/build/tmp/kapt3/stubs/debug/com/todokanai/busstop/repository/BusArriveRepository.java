package com.todokanai.busstop.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/todokanai/busstop/repository/BusArriveRepository;", "", "()V", "arriveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/todokanai/busstop/room/retrofitdata/BusArrive;", "getArriveData", "()Landroidx/lifecycle/MutableLiveData;", "repository", "Lcom/todokanai/busstop/retrofit/RetrofitRepository;", "getArrive", "", "nodeId", "", "app_debug"})
public final class BusArriveRepository {
    private final com.todokanai.busstop.retrofit.RetrofitRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.todokanai.busstop.room.retrofitdata.BusArrive>> arriveData = null;
    
    public BusArriveRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.todokanai.busstop.room.retrofitdata.BusArrive>> getArriveData() {
        return null;
    }
    
    public final void getArrive(@org.jetbrains.annotations.NotNull()
    java.lang.String nodeId) {
    }
}