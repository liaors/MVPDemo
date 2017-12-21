package com.rs.mvpdemo.activity.login;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.rs.mvpdemo.MyApp;
import com.rs.mvpdemo.R;
import com.rs.mvpdemo.model.bean.LoginBean;
import com.rs.mvpdemo.mvp.BaseAppCompatActivity;
import com.rs.mvpdemo.mvp.factory.CreatePresenter;
import com.rs.mvpdemo.ui.activity.HomeActivity;
import com.squareup.leakcanary.RefWatcher;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


@CreatePresenter(LoginPresenter.class)
public class MainActivity extends BaseAppCompatActivity<LoginView, LoginPresenter> implements LoginView {
    @BindView(R.id.loginName)
    EditText loginName;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.resort)
    Button resort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        RefWatcher refWatcher = MyApp.getRefWatcher(this);//1
        refWatcher.watch(this);
    }

    @OnClick(R.id.resort)
    public void onClick() {
        getMvpPresenter().clickLogin(loginName.getText().toString(), password.getText().toString(), 1);
    }

    @Override
    public void getLoginData(LoginBean bean) {
        openIntent(HomeActivity.class);
    }

    @Override
    public Context getContext() {
        return this;
    }
}
