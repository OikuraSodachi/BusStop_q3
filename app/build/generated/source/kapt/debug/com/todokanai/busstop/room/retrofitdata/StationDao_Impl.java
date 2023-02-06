package com.todokanai.busstop.room.retrofitdata;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class StationDao_Impl implements StationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Station> __insertionAdapterOfStation;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public StationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStation = new EntityInsertionAdapter<Station>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `room_station` (`gpslati`,`gpslong`,`nodeid`,`nodenm`,`nodeno`,`no`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Station value) {
        stmt.bindDouble(1, value.getGpslati());
        stmt.bindDouble(2, value.getGpslong());
        if (value.getNodeid() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNodeid());
        }
        if (value.getNodenm() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNodenm());
        }
        stmt.bindLong(5, value.getNodeno());
        if (value.getNo() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getNo());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete from room_station";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Station station, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStation.insert(station);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Station>> getAll() {
    final String _sql = "select * from room_station";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"room_station"}, new Callable<List<Station>>() {
      @Override
      public List<Station> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfGpslati = CursorUtil.getColumnIndexOrThrow(_cursor, "gpslati");
          final int _cursorIndexOfGpslong = CursorUtil.getColumnIndexOrThrow(_cursor, "gpslong");
          final int _cursorIndexOfNodeid = CursorUtil.getColumnIndexOrThrow(_cursor, "nodeid");
          final int _cursorIndexOfNodenm = CursorUtil.getColumnIndexOrThrow(_cursor, "nodenm");
          final int _cursorIndexOfNodeno = CursorUtil.getColumnIndexOrThrow(_cursor, "nodeno");
          final int _cursorIndexOfNo = CursorUtil.getColumnIndexOrThrow(_cursor, "no");
          final List<Station> _result = new ArrayList<Station>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Station _item;
            final double _tmpGpslati;
            _tmpGpslati = _cursor.getDouble(_cursorIndexOfGpslati);
            final double _tmpGpslong;
            _tmpGpslong = _cursor.getDouble(_cursorIndexOfGpslong);
            final String _tmpNodeid;
            if (_cursor.isNull(_cursorIndexOfNodeid)) {
              _tmpNodeid = null;
            } else {
              _tmpNodeid = _cursor.getString(_cursorIndexOfNodeid);
            }
            final String _tmpNodenm;
            if (_cursor.isNull(_cursorIndexOfNodenm)) {
              _tmpNodenm = null;
            } else {
              _tmpNodenm = _cursor.getString(_cursorIndexOfNodenm);
            }
            final int _tmpNodeno;
            _tmpNodeno = _cursor.getInt(_cursorIndexOfNodeno);
            _item = new Station(_tmpGpslati,_tmpGpslong,_tmpNodeid,_tmpNodenm,_tmpNodeno);
            final Long _tmpNo;
            if (_cursor.isNull(_cursorIndexOfNo)) {
              _tmpNo = null;
            } else {
              _tmpNo = _cursor.getLong(_cursorIndexOfNo);
            }
            _item.setNo(_tmpNo);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
