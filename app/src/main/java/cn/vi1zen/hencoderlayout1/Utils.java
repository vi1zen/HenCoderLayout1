package cn.vi1zen.hencoderlayout1;

import android.content.res.Resources;
import android.util.DisplayMetrics;

public class Utils {
    public static float dpToPixel(float dp) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return dp * metrics.density;
    }
}
