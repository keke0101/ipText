package com.example.ipedittext;

import android.content.Context;
import android.content.SharedPreferences;




public class ShareUtils {

    public static final String NAME = "user";

    //键 值
    public static void putString(String key,String value){

        SharedPreferences sp = MyApplication.getAppContext().getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putString(key,value).apply();
    }

    //键 默认值
    public static String getString(String key,String defValue){
        SharedPreferences sp = MyApplication.getAppContext().getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return sp.getString(key,defValue);
    }

    //键 值
    public static void putInt(String key,int value){
        SharedPreferences sp = MyApplication.getAppContext().getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putInt(key,value).apply();
    }

    //键 默认值
    public static int getInt(String key,int defValue){
        SharedPreferences sp = MyApplication.getAppContext().getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return sp.getInt(key,defValue);
    }

    //键 值
    public static void putBoolean(String key,boolean value){
        SharedPreferences sp = MyApplication.getAppContext().getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putBoolean(key,value).apply();
    }

    //键 默认值
    public static boolean getBoolean(String key,boolean defValue){
        SharedPreferences sp = MyApplication.getAppContext().getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return sp.getBoolean(key,defValue);
    }

    //刪除 单个
    public static void deleShare(String key){
        SharedPreferences sp = MyApplication.getAppContext().getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().remove(key).apply();
    }

    //刪除 全部
    public static void deleAll(){
        SharedPreferences sp = MyApplication.getAppContext().getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().clear().apply();
    }

}