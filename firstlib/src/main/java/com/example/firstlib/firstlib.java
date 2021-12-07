package com.example.firstlib;

import android.content.Context;
import android.widget.Toast;

public class firstlib {
    public static void simpleToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
