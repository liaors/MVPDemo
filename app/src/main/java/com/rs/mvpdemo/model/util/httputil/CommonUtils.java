package com.rs.mvpdemo.model.util.httputil;

import android.content.Context;

/**
 * Created by Rs on 2017/12/18.
 */

public class CommonUtils {
    public static Context appContext;
    private static CommonUtils instance;

    public static synchronized CommonUtils getInstance() {
        if (instance == null) {
            instance = new CommonUtils();
        }
        return instance;
    }
    public static void setContext(Context context) {
        if (null == appContext)
            appContext = context;
    }
}
