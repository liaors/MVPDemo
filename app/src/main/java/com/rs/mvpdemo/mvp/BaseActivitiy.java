package com.rs.mvpdemo.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rs.mvpdemo.mvp.factory.PresenterMvpFactory;
import com.rs.mvpdemo.mvp.factory.PresenterMvpFactoryImpl;
import com.rs.mvpdemo.mvp.proxy.BaseMvpProxy;
import com.rs.mvpdemo.mvp.proxy.PresenterProxyInterface;

/**
 * Created by Rs on 2017/12/19.
 */

public abstract class BaseActivitiy<V extends BaseView, P extends BasePresenter<V>> extends AppCompatActivity implements PresenterProxyInterface<V,P> {
    private static final String PRESENTER_SAVE_KEY = "presenter_save_key";
    /**
     * 创建被代理对象,传入默认Presenter的工厂
     */
    private BaseMvpProxy<V,P> mProxy = new BaseMvpProxy<>(PresenterMvpFactoryImpl.<V,P>createFactory(getClass()));
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState != null){
            mProxy.onRestoreInstanceState(savedInstanceState.getBundle(PRESENTER_SAVE_KEY));
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        mProxy.onResume((V) this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mProxy.onDestroy();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBundle(PRESENTER_SAVE_KEY,mProxy.onSaveInstanceState());
    }
    @Override
    public void setPresenterFactory(PresenterMvpFactory<V, P> presenterFactory) {
        mProxy.setPresenterFactory(presenterFactory);
    }
    @Override
    public PresenterMvpFactory<V, P> getPresenterFactory() {
        return mProxy.getPresenterFactory();
    }
    @Override
    public P getMvpPresenter() {
        return mProxy.getMvpPresenter();
    }
}
