package com.ulil0031.example.belajarandroidbyulil.util;

import android.content.Context;
import android.content.SharedPreferences;




public class PreferencesHelper {
    private static PreferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    private PreferencesHelper(Context context){
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("simple.android.app" , Context.MODE_PRIVATE);

    }

    public static PreferencesHelper getInstance(Context context) {
        if (INSTANCE == null ) {
            INSTANCE = new PreferencesHelper(context);
        }
        return INSTANCE;
    }
    public SharedPreferences Pref(){
        return sharedPreferences;
    }

    public Boolean isilogin() {
        return sharedPreferences.getBoolean("islogin", false);
    }

    public void setLogin(boolean isCall){
        sharedPreferences.edit().putBoolean("isLogin", isCall).apply();
    }

    public void setName(String isName) {
        sharedPreferences.edit().putString("isName", isName).apply();
    }
    public String getName(){
        return sharedPreferences.getString("isName" , "");
    }
}
