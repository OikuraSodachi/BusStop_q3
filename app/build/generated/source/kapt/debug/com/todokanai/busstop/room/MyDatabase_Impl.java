package com.todokanai.busstop.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.todokanai.busstop.room.retrofitdata.StationDao;
import com.todokanai.busstop.room.retrofitdata.StationDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MyDatabase_Impl extends MyDatabase {
  private volatile UserDao _userDao;

  private volatile StationDao _stationDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `room_user` (`number` INTEGER, `name` TEXT, `no` INTEGER, PRIMARY KEY(`no`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `room_station` (`gpslati` REAL NOT NULL, `gpslong` REAL NOT NULL, `nodeid` TEXT NOT NULL, `nodenm` TEXT NOT NULL, `nodeno` INTEGER NOT NULL, `no` INTEGER, PRIMARY KEY(`no`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1e8d7001249a3f517ac28f242ca9b25e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `room_user`");
        _db.execSQL("DROP TABLE IF EXISTS `room_station`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRoomUser = new HashMap<String, TableInfo.Column>(3);
        _columnsRoomUser.put("number", new TableInfo.Column("number", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomUser.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomUser.put("no", new TableInfo.Column("no", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRoomUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRoomUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRoomUser = new TableInfo("room_user", _columnsRoomUser, _foreignKeysRoomUser, _indicesRoomUser);
        final TableInfo _existingRoomUser = TableInfo.read(_db, "room_user");
        if (! _infoRoomUser.equals(_existingRoomUser)) {
          return new RoomOpenHelper.ValidationResult(false, "room_user(com.todokanai.busstop.room.User).\n"
                  + " Expected:\n" + _infoRoomUser + "\n"
                  + " Found:\n" + _existingRoomUser);
        }
        final HashMap<String, TableInfo.Column> _columnsRoomStation = new HashMap<String, TableInfo.Column>(6);
        _columnsRoomStation.put("gpslati", new TableInfo.Column("gpslati", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomStation.put("gpslong", new TableInfo.Column("gpslong", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomStation.put("nodeid", new TableInfo.Column("nodeid", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomStation.put("nodenm", new TableInfo.Column("nodenm", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomStation.put("nodeno", new TableInfo.Column("nodeno", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomStation.put("no", new TableInfo.Column("no", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRoomStation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRoomStation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRoomStation = new TableInfo("room_station", _columnsRoomStation, _foreignKeysRoomStation, _indicesRoomStation);
        final TableInfo _existingRoomStation = TableInfo.read(_db, "room_station");
        if (! _infoRoomStation.equals(_existingRoomStation)) {
          return new RoomOpenHelper.ValidationResult(false, "room_station(com.todokanai.busstop.room.retrofitdata.Station).\n"
                  + " Expected:\n" + _infoRoomStation + "\n"
                  + " Found:\n" + _existingRoomStation);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "1e8d7001249a3f517ac28f242ca9b25e", "d73cd3f6ad9e86d79ee2e9ffe95e7d2e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "room_user","room_station");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `room_user`");
      _db.execSQL("DELETE FROM `room_station`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(StationDao.class, StationDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public StationDao stationDao() {
    if (_stationDao != null) {
      return _stationDao;
    } else {
      synchronized(this) {
        if(_stationDao == null) {
          _stationDao = new StationDao_Impl(this);
        }
        return _stationDao;
      }
    }
  }
}
