package com.todokanai.busstop.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/H\u0016J\u001a\u00100\u001a\u0002012\u0006\u00102\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060$X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/todokanai/busstop/fragment/MapFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "allStationList", "", "Lcom/todokanai/busstop/room/retrofitdata/Station;", "getAllStationList", "()Ljava/util/List;", "setAllStationList", "(Ljava/util/List;)V", "binding", "Lcom/todokanai/busstop/databinding/FragmentMapBinding;", "callback", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "cameraZoom", "Landroidx/lifecycle/MutableLiveData;", "", "disableClear", "", "getDisableClear", "()Z", "setDisableClear", "(Z)V", "markerTrigger", "viewModel", "Lcom/todokanai/busstop/viewmodel/MapViewModel;", "getViewModel", "()Lcom/todokanai/busstop/viewmodel/MapViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "visibleRegion", "Lcom/google/android/gms/maps/model/VisibleRegion;", "getVisibleRegion", "()Landroidx/lifecycle/MutableLiveData;", "visibleStationList", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMarkerClick", "marker", "Lcom/google/android/gms/maps/model/Marker;", "onViewCreated", "", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MapFragment extends androidx.fragment.app.Fragment implements com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    private com.todokanai.busstop.databinding.FragmentMapBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public java.util.List<com.todokanai.busstop.room.retrofitdata.Station> allStationList;
    private final java.util.List<com.todokanai.busstop.room.retrofitdata.Station> visibleStationList = null;
    private boolean markerTrigger = false;
    private final androidx.lifecycle.MutableLiveData<java.lang.Float> cameraZoom = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.android.gms.maps.model.VisibleRegion> visibleRegion = null;
    private boolean disableClear = true;
    private final com.google.android.gms.maps.OnMapReadyCallback callback = null;
    
    public MapFragment() {
        super();
    }
    
    private final com.todokanai.busstop.viewmodel.MapViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.todokanai.busstop.room.retrofitdata.Station> getAllStationList() {
        return null;
    }
    
    public final void setAllStationList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.todokanai.busstop.room.retrofitdata.Station> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.android.gms.maps.model.VisibleRegion> getVisibleRegion() {
        return null;
    }
    
    public final boolean getDisableClear() {
        return false;
    }
    
    public final void setDisableClear(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker marker) {
        return false;
    }
}