package com.rs.mvpdemo.model.util.httputil.subscribers;

/**
 * Created by liukun on 16/3/10.
 */
public interface  SubscriberOnNextListener<T> {
    void onNext(T t) ;
}
