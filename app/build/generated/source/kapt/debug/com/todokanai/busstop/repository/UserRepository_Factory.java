// Generated by Dagger (https://dagger.dev).
package com.todokanai.busstop.repository;

import com.todokanai.busstop.room.UserDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<UserDao> userDaoProvider;

  public UserRepository_Factory(Provider<UserDao> userDaoProvider) {
    this.userDaoProvider = userDaoProvider;
  }

  @Override
  public UserRepository get() {
    return newInstance(userDaoProvider.get());
  }

  public static UserRepository_Factory create(Provider<UserDao> userDaoProvider) {
    return new UserRepository_Factory(userDaoProvider);
  }

  public static UserRepository newInstance(UserDao userDao) {
    return new UserRepository(userDao);
  }
}
