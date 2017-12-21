package com.rs.mvpdemo.model.util.httputil;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rs on 2017/12/15.
 */
public class HttpStatus {
    @SerializedName("status")
    private int status;
    @SerializedName("message")
    private String mMessage;

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return mMessage;
    }

    /**
     * API是否请求失败
     *
     * @return 失败返回true, 成功返回false
     */
    public boolean isCodeInvalid() {
        return status != 200;
    }
}
