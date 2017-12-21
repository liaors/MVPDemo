package com.rs.mvpdemo.model.util;

import android.widget.TextView;

/**
 * Created by Rs on 2017/12/18.
 */

public class DataHandleUtils {
    private static DataHandleUtils instance;
    public synchronized static DataHandleUtils getInstance(){
        if(instance ==null){
            instance = new DataHandleUtils();
        }
        return instance;
    }

     public void setText(TextView textView,String text){
         try {
             textView.setText(text);
         } catch (Exception e) {
             e.printStackTrace();
         }
     }


}
