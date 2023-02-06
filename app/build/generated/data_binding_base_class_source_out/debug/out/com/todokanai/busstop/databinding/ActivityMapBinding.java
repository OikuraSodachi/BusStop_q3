// Generated by data binding compiler. Do not edit!
package com.todokanai.busstop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.todokanai.busstop.R;
import com.todokanai.busstop.activity.MapActivity;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMapBinding extends ViewDataBinding {
  @NonNull
  public final FragmentContainerView busArriveContainerView;

  @NonNull
  public final Button endBtn;

  @NonNull
  public final FragmentContainerView endFragmentContainer;

  @NonNull
  public final FragmentContainerView mapContainerView;

  @NonNull
  public final Button sizeBtn;

  @NonNull
  public final Button startBtn;

  @NonNull
  public final ConstraintLayout startEndConstraint;

  @NonNull
  public final FragmentContainerView startEndOptionContainer;

  @NonNull
  public final FragmentContainerView startFragmentContainer;

  @Bindable
  protected MapActivity mMapActivity;

  protected ActivityMapBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FragmentContainerView busArriveContainerView, Button endBtn,
      FragmentContainerView endFragmentContainer, FragmentContainerView mapContainerView,
      Button sizeBtn, Button startBtn, ConstraintLayout startEndConstraint,
      FragmentContainerView startEndOptionContainer, FragmentContainerView startFragmentContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.busArriveContainerView = busArriveContainerView;
    this.endBtn = endBtn;
    this.endFragmentContainer = endFragmentContainer;
    this.mapContainerView = mapContainerView;
    this.sizeBtn = sizeBtn;
    this.startBtn = startBtn;
    this.startEndConstraint = startEndConstraint;
    this.startEndOptionContainer = startEndOptionContainer;
    this.startFragmentContainer = startFragmentContainer;
  }

  public abstract void setMapActivity(@Nullable MapActivity MapActivity);

  @Nullable
  public MapActivity getMapActivity() {
    return mMapActivity;
  }

  @NonNull
  public static ActivityMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_map, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMapBinding>inflateInternal(inflater, R.layout.activity_map, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_map, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMapBinding>inflateInternal(inflater, R.layout.activity_map, null, false, component);
  }

  public static ActivityMapBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMapBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMapBinding)bind(component, view, R.layout.activity_map);
  }
}