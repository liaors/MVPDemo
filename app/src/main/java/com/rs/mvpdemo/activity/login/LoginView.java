package com.rs.mvpdemo.activity.login;


import com.rs.mvpdemo.model.bean.LoginBean;
import com.rs.mvpdemo.mvp.BaseView;

public interface LoginView extends BaseView {
    void getLoginData(LoginBean bean);
}
