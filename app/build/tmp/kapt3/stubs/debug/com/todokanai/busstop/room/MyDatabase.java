package com.todokanai.busstop.room;

import java.lang.System;

@androidx.room.Database(entities = {com.todokanai.busstop.room.User.class, com.todokanai.busstop.room.retrofitdata.Station.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/todokanai/busstop/room/MyDatabase;", "Landroidx/room/RoomDatabase;", "()V", "stationDao", "Lcom/todokanai/busstop/room/retrofitdata/StationDao;", "userDao", "Lcom/todokanai/busstop/room/UserDao;", "Companion", "app_debug"})
public abstract class MyDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.todokanai.busstop.room.MyDatabase.Companion Companion = null;
    private static com.todokanai.busstop.room.MyDatabase instance;
    
    public MyDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.todokanai.busstop.room.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.todokanai.busstop.room.retrofitdata.StationDao stationDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/todokanai/busstop/room/MyDatabase$Companion;", "", "()V", "instance", "Lcom/todokanai/busstop/room/MyDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized com.todokanai.busstop.room.MyDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}