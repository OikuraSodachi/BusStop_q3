package com.todokanai.busstop.databinding;
import com.todokanai.busstop.R;
import com.todokanai.busstop.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMapBindingImpl extends ActivityMapBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mapContainerView, 1);
        sViewsWithIds.put(R.id.startBtn, 2);
        sViewsWithIds.put(R.id.sizeBtn, 3);
        sViewsWithIds.put(R.id.endBtn, 4);
        sViewsWithIds.put(R.id.busArriveContainerView, 5);
        sViewsWithIds.put(R.id.startEndConstraint, 6);
        sViewsWithIds.put(R.id.endFragmentContainer, 7);
        sViewsWithIds.put(R.id.startFragmentContainer, 8);
        sViewsWithIds.put(R.id.startEndOptionContainer, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMapBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityMapBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.fragment.app.FragmentContainerView) bindings[5]
            , (android.widget.Button) bindings[4]
            , (androidx.fragment.app.FragmentContainerView) bindings[7]
            , (androidx.fragment.app.FragmentContainerView) bindings[1]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.fragment.app.FragmentContainerView) bindings[9]
            , (androidx.fragment.app.FragmentContainerView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.MapActivity == variableId) {
            setMapActivity((com.todokanai.busstop.activity.MapActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMapActivity(@Nullable com.todokanai.busstop.activity.MapActivity MapActivity) {
        this.mMapActivity = MapActivity;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): MapActivity
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}