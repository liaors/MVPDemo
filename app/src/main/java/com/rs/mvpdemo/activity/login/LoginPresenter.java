package com.rs.mvpdemo.activity.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.rs.mvpdemo.model.bean.LoginBean;
import com.rs.mvpdemo.model.util.httputil.subscribers.SubscriberOnNextListener;
import com.rs.mvpdemo.mvp.BasePresenter;

public class LoginPresenter extends BasePresenter<LoginView> {
    private final LoginModel mRequestMode;
    public LoginPresenter() {
        this.mRequestMode = new LoginModel();
    }

    public void clickLogin(String loginName,String password,final int type){
        mRequestMode.getLoginData(loginName,password,getMvpView().getContext(),type, new SubscriberOnNextListener<LoginBean>() {
            @Override
            public void onNext(LoginBean o) {
                getMvpView().getLoginData(o);
            }
        });
    }


    @Override
    public void onCreatePersenter(@Nullable Bundle savedState) {
        super.onCreatePersenter(savedState);
        if(savedState != null){
          //  Log.e("perfect-mvp","RequestPresenter5  onCreatePersenter 测试  = " + savedState.getString("test2") );
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
       // Log.e("perfect-mvp","RequestPresenter5  onSaveInstanceState 测试 " );
        outState.putString("test2","test_save2");
    }

    @Override
    public void onDestroyPersenter() {
        super.onDestroyPersenter();
    }

}
