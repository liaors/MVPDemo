package com.rs.mvpdemo.mvp.proxy;

import com.rs.mvpdemo.mvp.factory.PresenterMvpFactory;
import com.rs.mvpdemo.mvp.BasePresenter;

/**
 * Created by Rs on 2017/12/19.
 */

public interface PresenterProxyInterface<V,P extends BasePresenter<V>> {
    /**
     * 设置创建Presenter的工厂
     * @param presenterFactory PresenterFactory类型
     */
    void setPresenterFactory(PresenterMvpFactory<V,P> presenterFactory);
    /**
     * 获取Presenter的工厂类
     * @return 返回PresenterMvpFactory类型
     */
    PresenterMvpFactory<V,P> getPresenterFactory();
    /**
     * 获取创建的Presenter
     * @return 指定类型的Presenter
     */
    P getMvpPresenter();
}
