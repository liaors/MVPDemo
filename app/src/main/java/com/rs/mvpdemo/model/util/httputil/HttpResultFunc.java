package com.rs.mvpdemo.model.util.httputil;

import android.util.Log;

import com.google.gson.Gson;

import com.rs.mvpdemo.model.bean.BaseResult;
import rx.functions.Func1;


/**
 * Created by Rs on 2017/12/15.
 */

public class HttpResultFunc<T> implements Func1<BaseResult<T>, T> {
    @Override
    public T call(BaseResult<T> httpResult) {
        if (httpResult.getCode()!=null &&httpResult.getCode().equals("1000007")) {
            throw new ApiException(1000007);
        }
        Log.e("TAG", "call: "+ new Gson().toJson(httpResult.getResult()));
        return httpResult.getResult();
    }
}