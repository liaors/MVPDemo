package com.rs.mvpdemo.mvp.factory;

import com.rs.mvpdemo.mvp.BasePresenter;

/**
 * Created by Rs on 2017/12/19.
 */

public interface PresenterMvpFactory<V,P extends BasePresenter<V>> {
    P createMvpPresenter();
}
