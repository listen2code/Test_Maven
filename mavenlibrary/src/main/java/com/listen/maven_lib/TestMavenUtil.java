package com.listen.maven_lib;

import android.content.Context;
import android.widget.Toast;

/**
 * @author listen
 * @desc
 */
public class TestMavenUtil {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}