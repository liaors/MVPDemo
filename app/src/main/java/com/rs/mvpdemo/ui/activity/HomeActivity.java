package com.rs.mvpdemo.ui.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.rs.mvpdemo.mvp.BaseAppCompatActivity;
import com.rs.mvpdemo.presenter.HomePresenter;
import com.rs.mvpdemo.ui.view.HomeView;

/**
 * Created by Rs on 2017/12/21.
 */

public class HomeActivity extends BaseAppCompatActivity<HomeView,HomePresenter> implements HomeView {
    
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public void getListData() {

    }

    @Override
    public void getContext() {

    }
}
