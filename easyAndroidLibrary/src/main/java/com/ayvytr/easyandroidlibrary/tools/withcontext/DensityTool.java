package com.ayvytr.easyandroidlibrary.tools.withcontext;

import com.ayvytr.easyandroidlibrary.Easy;
import com.ayvytr.easyandroidlibrary.exception.UnsupportedInitializationException;

/**
 * Dp - Px 相互转化，提供了int，float，double 3种类型的重载方法，尽可能减少外部强制类型转换.
 * @author Ayvytr <a href="https://github.com/Ayvytr" target="_blank">'s GitHub</a>
 * @since 1.0.0
 */

public class DensityTool
{
    private DensityTool()
    {
        throw new UnsupportedInitializationException();
    }

    /**
     * 将px转换为dp
     */
    public static int px2dp(int px)
    {
        return (int) px2dp((float) px);
    }

    /**
     * 将px转换为dp，接收/返回float
     */
    public static float px2dp(float px)
    {
        return (float) px2dp((double) px);
    }

    /**
     * 将px转换为dp，接收/返回double
     */
    public static double px2dp(double px)
    {
        float scale = Easy.getContext().getResources().getDisplayMetrics().density;
        return px / scale + 0.5;
    }

    /**
     * 将dp转换为px，接收/返回int
     */
    public static int dp2px(int dp)
    {
        return (int) dp2px((float) dp);
    }

    /**
     * 将dp转换为px，接收/返回float
     */
    public static float dp2px(float dp)
    {
        return (float) dp2px((double) dp);
    }

    /**
     * 将dp转换为px，接收/返回double
     */
    public static double dp2px(double dp)
    {
        float scale = Easy.getContext().getResources().getDisplayMetrics().density;
        return dp * scale + 0.5f;
    }
}
