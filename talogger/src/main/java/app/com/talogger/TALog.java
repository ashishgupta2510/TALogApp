package app.com.talogger;

import android.util.Log;

import static android.content.ContentValues.TAG;

public class TALog {

    public static void debug(String message){
        Log.e(TAG, message);
    }
}
