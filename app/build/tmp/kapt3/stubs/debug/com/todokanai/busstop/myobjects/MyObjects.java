package com.todokanai.busstop.myobjects;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/todokanai/busstop/myobjects/MyObjects;", "", "()V", "myDatabase", "Lcom/todokanai/busstop/room/MyDatabase;", "getMyDatabase", "()Lcom/todokanai/busstop/room/MyDatabase;", "storedData", "Landroidx/lifecycle/MutableLiveData;", "", "getStoredData", "()Landroidx/lifecycle/MutableLiveData;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "app_debug"})
public final class MyObjects {
    @org.jetbrains.annotations.NotNull()
    public static final com.todokanai.busstop.myobjects.MyObjects INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.todokanai.busstop.room.MyDatabase myDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.properties.ReadOnlyProperty dataStore$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.String> storedData = null;
    
    private MyObjects() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.todokanai.busstop.room.MyDatabase getMyDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$dataStore) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getStoredData() {
        return null;
    }
}