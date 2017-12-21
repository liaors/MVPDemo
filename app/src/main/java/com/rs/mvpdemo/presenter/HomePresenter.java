package com.rs.mvpdemo.presenter;

import com.rs.mvpdemo.model.HomeModel;
import com.rs.mvpdemo.mvp.BasePresenter;
import com.rs.mvpdemo.ui.view.HomeView;

/**
 * Created by Rs on 2017/12/21.
 */

public class HomePresenter extends BasePresenter<HomeView> {
    private HomeModel mHomeModel;
    public HomePresenter(HomeModel mHomeModel) {
        this.mHomeModel = mHomeModel;
    }
}
