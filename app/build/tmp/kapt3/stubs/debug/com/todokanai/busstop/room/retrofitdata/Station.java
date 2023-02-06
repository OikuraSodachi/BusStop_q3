package com.todokanai.busstop.room.retrofitdata;

import java.lang.System;

@androidx.room.Entity(tableName = "room_station")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010#\u001a\u00020$J\t\u0010%\u001a\u00020\tH\u00d6\u0001J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lcom/todokanai/busstop/room/retrofitdata/Station;", "", "gpslati", "", "gpslong", "nodeid", "", "nodenm", "nodeno", "", "(DDLjava/lang/String;Ljava/lang/String;I)V", "getGpslati", "()D", "getGpslong", "no", "", "getNo", "()Ljava/lang/Long;", "setNo", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getNodeid", "()Ljava/lang/String;", "getNodenm", "getNodeno", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "getLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "hashCode", "toString", "app_debug"})
public final class Station {
    @androidx.room.ColumnInfo()
    private final double gpslati = 0.0;
    @androidx.room.ColumnInfo()
    private final double gpslong = 0.0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo()
    private final java.lang.String nodeid = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo()
    private final java.lang.String nodenm = null;
    @androidx.room.ColumnInfo()
    private final int nodeno = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo()
    @androidx.room.PrimaryKey(autoGenerate = false)
    private java.lang.Long no;
    
    @org.jetbrains.annotations.NotNull()
    public final com.todokanai.busstop.room.retrofitdata.Station copy(double gpslati, double gpslong, @org.jetbrains.annotations.NotNull()
    java.lang.String nodeid, @org.jetbrains.annotations.NotNull()
    java.lang.String nodenm, int nodeno) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Station(double gpslati, double gpslong, @org.jetbrains.annotations.NotNull()
    java.lang.String nodeid, @org.jetbrains.annotations.NotNull()
    java.lang.String nodenm, int nodeno) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double getGpslati() {
        return 0.0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getGpslong() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNodeid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNodenm() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getNodeno() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getNo() {
        return null;
    }
    
    public final void setNo(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getLatLng() {
        return null;
    }
}