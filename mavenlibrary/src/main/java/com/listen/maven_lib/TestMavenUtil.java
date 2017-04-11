package com.listen.maven_lib;

import android.content.Context;
import android.widget.Toast;

/**
 * @author listen
 */
public class TestMavenUtil {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, "1.0.3：" + message, Toast.LENGTH_SHORT).show();
    }
}
