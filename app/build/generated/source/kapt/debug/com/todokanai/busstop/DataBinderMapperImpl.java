package com.todokanai.busstop;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.todokanai.busstop.databinding.ActivityMainBindingImpl;
import com.todokanai.busstop.databinding.ActivityMapBindingImpl;
import com.todokanai.busstop.databinding.FragmentBusArriveBindingImpl;
import com.todokanai.busstop.databinding.FragmentEndBindingImpl;
import com.todokanai.busstop.databinding.FragmentMainBindingImpl;
import com.todokanai.busstop.databinding.FragmentMapBindingImpl;
import com.todokanai.busstop.databinding.FragmentStartBindingImpl;
import com.todokanai.busstop.databinding.FragmentStartEndOptionBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYMAP = 2;

  private static final int LAYOUT_FRAGMENTBUSARRIVE = 3;

  private static final int LAYOUT_FRAGMENTEND = 4;

  private static final int LAYOUT_FRAGMENTMAIN = 5;

  private static final int LAYOUT_FRAGMENTMAP = 6;

  private static final int LAYOUT_FRAGMENTSTART = 7;

  private static final int LAYOUT_FRAGMENTSTARTENDOPTION = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.todokanai.busstop.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.todokanai.busstop.R.layout.activity_map, LAYOUT_ACTIVITYMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.todokanai.busstop.R.layout.fragment_bus_arrive, LAYOUT_FRAGMENTBUSARRIVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.todokanai.busstop.R.layout.fragment_end, LAYOUT_FRAGMENTEND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.todokanai.busstop.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.todokanai.busstop.R.layout.fragment_map, LAYOUT_FRAGMENTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.todokanai.busstop.R.layout.fragment_start, LAYOUT_FRAGMENTSTART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.todokanai.busstop.R.layout.fragment_start_end_option, LAYOUT_FRAGMENTSTARTENDOPTION);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAP: {
          if ("layout/activity_map_0".equals(tag)) {
            return new ActivityMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_map is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBUSARRIVE: {
          if ("layout/fragment_bus_arrive_0".equals(tag)) {
            return new FragmentBusArriveBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_bus_arrive is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEND: {
          if ("layout/fragment_end_0".equals(tag)) {
            return new FragmentEndBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_end is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAP: {
          if ("layout/fragment_map_0".equals(tag)) {
            return new FragmentMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_map is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTART: {
          if ("layout/fragment_start_0".equals(tag)) {
            return new FragmentStartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_start is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTARTENDOPTION: {
          if ("layout/fragment_start_end_option_0".equals(tag)) {
            return new FragmentStartEndOptionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_start_end_option is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(1, "BusArriveFragment");
      sKeys.put(2, "EndFragment");
      sKeys.put(3, "MainFragment");
      sKeys.put(4, "MapActivity");
      sKeys.put(5, "MapFragment");
      sKeys.put(6, "StartEndOptionFragment");
      sKeys.put(7, "StartFragment");
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.todokanai.busstop.R.layout.activity_main);
      sKeys.put("layout/activity_map_0", com.todokanai.busstop.R.layout.activity_map);
      sKeys.put("layout/fragment_bus_arrive_0", com.todokanai.busstop.R.layout.fragment_bus_arrive);
      sKeys.put("layout/fragment_end_0", com.todokanai.busstop.R.layout.fragment_end);
      sKeys.put("layout/fragment_main_0", com.todokanai.busstop.R.layout.fragment_main);
      sKeys.put("layout/fragment_map_0", com.todokanai.busstop.R.layout.fragment_map);
      sKeys.put("layout/fragment_start_0", com.todokanai.busstop.R.layout.fragment_start);
      sKeys.put("layout/fragment_start_end_option_0", com.todokanai.busstop.R.layout.fragment_start_end_option);
    }
  }
}
