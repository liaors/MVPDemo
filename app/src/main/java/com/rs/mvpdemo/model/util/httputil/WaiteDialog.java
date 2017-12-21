package com.rs.mvpdemo.model.util.httputil;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.rs.mvpdemo.R;


/**
 * Created by czj on 2016/9/17.
 */
public class WaiteDialog extends AlertDialog {
    private static WaiteDialog instance;
    public static Context mContext;

    public static synchronized WaiteDialog getInstance() {
        if (instance == null) {
            instance = new WaiteDialog(mContext);
        }
        return instance;
    }

    public WaiteDialog(Context context) {
        super(context);
        mContext = context;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setContentView(R.layout.wait_dialog);
        setCanceledOnTouchOutside(false);
    }
}
