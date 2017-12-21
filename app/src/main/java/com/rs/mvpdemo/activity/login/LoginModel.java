package com.rs.mvpdemo.activity.login;


import android.content.Context;

import java.util.HashMap;
import java.util.Map;

import com.rs.mvpdemo.mvp.BaseModel;
import com.rs.mvpdemo.model.bean.BaseResult;
import com.rs.mvpdemo.model.bean.LoginBean;
import rx.Observable;
import rx.functions.Func1;
import com.rs.mvpdemo.model.util.httputil.HttpMethods;
import com.rs.mvpdemo.model.util.httputil.HttpResultFunc;
import com.rs.mvpdemo.model.util.httputil.subscribers.BaseSubscriber;
import com.rs.mvpdemo.model.util.httputil.subscribers.SubscriberOnNextListener;


public class LoginModel extends BaseModel {

    public void getLoginData(String loginName,String password,Context context,int type, SubscriberOnNextListener loginListener){
        Map<String,Object> params = new HashMap<>();
        params.put("loginName",loginName);
        params.put("password",password);
        HttpMethods methods = HttpMethods.getInstance();
        Observable observable = methods.getService().login(type,params).map((Func1)new HttpResultFunc<BaseResult<LoginBean>>());
        methods.toSubscribe(observable,new BaseSubscriber(loginListener,context,false));
    }

}
