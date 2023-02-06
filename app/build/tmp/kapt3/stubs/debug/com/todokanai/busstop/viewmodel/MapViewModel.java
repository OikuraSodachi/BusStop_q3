package com.todokanai.busstop.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\bJ\u000e\u0010?\u001a\u00020=2\u0006\u0010>\u001a\u00020\bJ\u0006\u0010@\u001a\u00020=J\u0006\u0010A\u001a\u00020=J\u001e\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u00020 2\u0006\u0010D\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u001aJ\u0006\u0010F\u001a\u00020=J\r\u0010G\u001a\u0004\u0018\u00010=\u00a2\u0006\u0002\u0010HJ\u0010\u0010I\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0012R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u000701\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\rR\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\b0+\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010-R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b;\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"}, d2 = {"Lcom/todokanai/busstop/viewmodel/MapViewModel;", "Landroidx/lifecycle/ViewModel;", "stationRepository", "Lcom/todokanai/busstop/repository/StationRepository;", "(Lcom/todokanai/busstop/repository/StationRepository;)V", "_endStation", "Landroidx/lifecycle/MutableLiveData;", "", "", "_startStation", "areaThrough", "Lcom/todokanai/busstop/room/retrofitdata/ThroughLine;", "getAreaThrough", "()Landroidx/lifecycle/MutableLiveData;", "busArriveList", "Landroidx/lifecycle/LiveData;", "Lcom/todokanai/busstop/room/retrofitdata/BusArrive;", "getBusArriveList", "()Landroidx/lifecycle/LiveData;", "busArriveRepo", "Lcom/todokanai/busstop/repository/BusArriveRepository;", "getBusArriveRepo", "()Lcom/todokanai/busstop/repository/BusArriveRepository;", "busLocationRepo", "Lcom/todokanai/busstop/repository/BusLocationRepository;", "cameraLat", "", "getCameraLat", "()D", "cameraLng", "getCameraLng", "cameraZoom", "", "getCameraZoom", "()F", "currentNodeId", "getCurrentNodeId", "()Ljava/lang/String;", "setCurrentNodeId", "(Ljava/lang/String;)V", "dataStore", "Lcom/todokanai/busstop/repository/DataStoreRepository;", "endList", "", "getEndList", "()Ljava/util/List;", "endStation", "getEndStation", "getAllFromNet", "Lkotlinx/coroutines/flow/Flow;", "Lcom/todokanai/busstop/room/retrofitdata/Station;", "getGetAllFromNet", "()Lkotlinx/coroutines/flow/Flow;", "map_status", "", "getMap_status", "startList", "getStartList", "startStation", "getStartStation", "addToEnd", "", "nodeId", "addToStart", "defaultMode", "endMode", "insertCameraFocus", "zoomLevel", "latitude", "longitude", "startMode", "updateArrive", "()Lkotlin/Unit;", "updateCurrentNodeId", "app_debug"})
public final class MapViewModel extends androidx.lifecycle.ViewModel {
    private final com.todokanai.busstop.repository.StationRepository stationRepository = null;
    private final com.todokanai.busstop.repository.DataStoreRepository dataStore = null;
    @org.jetbrains.annotations.NotNull()
    private final com.todokanai.busstop.repository.BusArriveRepository busArriveRepo = null;
    private final com.todokanai.busstop.repository.BusLocationRepository busLocationRepo = null;
    private final float cameraZoom = 0.0F;
    private final double cameraLat = 0.0;
    private final double cameraLng = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.todokanai.busstop.room.retrofitdata.Station>> getAllFromNet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> map_status = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentNodeId;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.todokanai.busstop.room.retrofitdata.BusArrive>> busArriveList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> startList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> endList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _startStation = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _endStation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.todokanai.busstop.room.retrofitdata.ThroughLine>> areaThrough = null;
    
    @javax.inject.Inject()
    public MapViewModel(@org.jetbrains.annotations.NotNull()
    com.todokanai.busstop.repository.StationRepository stationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.todokanai.busstop.repository.BusArriveRepository getBusArriveRepo() {
        return null;
    }
    
    public final float getCameraZoom() {
        return 0.0F;
    }
    
    public final double getCameraLat() {
        return 0.0;
    }
    
    public final double getCameraLng() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.todokanai.busstop.room.retrofitdata.Station>> getGetAllFromNet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMap_status() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentNodeId() {
        return null;
    }
    
    public final void setCurrentNodeId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.todokanai.busstop.room.retrofitdata.BusArrive>> getBusArriveList() {
        return null;
    }
    
    public final void insertCameraFocus(float zoomLevel, double latitude, double longitude) {
    }
    
    public final void updateCurrentNodeId(@org.jetbrains.annotations.Nullable()
    java.lang.String nodeId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit updateArrive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getStartList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getEndList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getStartStation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getEndStation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.todokanai.busstop.room.retrofitdata.ThroughLine>> getAreaThrough() {
        return null;
    }
    
    public final void startMode() {
    }
    
    public final void endMode() {
    }
    
    public final void defaultMode() {
    }
    
    public final void addToStart(@org.jetbrains.annotations.NotNull()
    java.lang.String nodeId) {
    }
    
    public final void addToEnd(@org.jetbrains.annotations.NotNull()
    java.lang.String nodeId) {
    }
}