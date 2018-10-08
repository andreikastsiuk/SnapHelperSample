package com.toplin.snaphelpersample.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;

import androidx.annotation.NonNull;

public final class ScreenUtils {

    /**
     * Return the width of screen, in pixel.
     *
     * @return the width of screen, in pixel
     */
    public static int getScreenWidth(@NonNull Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Point point = new Point();
        if (wm != null) {
            wm.getDefaultDisplay().getRealSize(point);
        }
        return point.x;
    }

    /**
     * Return the height of screen, in pixel.
     *
     * @return the height of screen, in pixel
     */
    public static int getScreenHeight(@NonNull Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Point point = new Point();
        if (wm != null) {
            wm.getDefaultDisplay().getRealSize(point);
        }
        return point.y;
    }

    /**
     * Return the density of screen.
     *
     * @return the density of screen
     */
    public static float getScreenDensity() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /**
     * Return the screen density expressed as dots-per-inch.
     *
     * @return the screen density expressed as dots-per-inch
     */
    public static int getScreenDensityDpi() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }
}
