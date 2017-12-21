package com.rs.mvpdemo.model.util.httputil;



import com.rs.mvpdemo.model.bean.PostBean;

import java.util.ArrayList;
import java.util.Map;

import com.rs.mvpdemo.model.bean.BaseResult;
import com.rs.mvpdemo.model.bean.LoginBean;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;


public interface ApiService {

    @POST(HttpUtils.LOGIN_URL)
    Observable<BaseResult<LoginBean>> login(@Path("source") int source, @Body Map<String, Object> params);

    @GET(HttpUtils.POST_LIST)
   Observable<BaseResult<ArrayList<PostBean>>> POST_LIST();
}
