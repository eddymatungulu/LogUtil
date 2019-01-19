package com.goddy.logutil;

import android.util.Log;

public class LogDebug  {
    private static String TAG = "LogDebugApp";
    public static void d (String message){
        Log.d(TAG,message);
    }
}
