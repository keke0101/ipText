package com.example.ipedittext;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    @SuppressLint("StaticFieldLeak")
    private static Context context;

    public static Context getAppContext(){
        return  context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        Constant.loginUser = ShareUtils.getString(Constant.loginUserKey, null);
        Constant.loginPassword = ShareUtils.getString(Constant.loginPasswordKey, null);
        Constant.loginIp = ShareUtils.getString(Constant.ipKey, null);
    }
}
