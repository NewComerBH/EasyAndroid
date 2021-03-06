package com.ayvytr.easyandroidlibrary.tools.withcontext;

import android.support.annotation.StringRes;
import android.widget.Toast;

import com.ayvytr.easyandroidlibrary.Easy;
import com.ayvytr.easyandroidlibrary.exception.UnsupportedInitializationException;

/**
 * Toast工具类，提供简便的Toast创建和输出功能.
 *
 * @author Ayvytr <a href="https://github.com/Ayvytr" target="_blank">'s GitHub</a>
 * @see Toast
 * @since 1.0.0
 */

public class ToastTool
{
    private ToastTool()
    {
        throw new UnsupportedInitializationException();
    }

    /**
     * 创建Toast并返回
     *
     * @param text Toast文本
     * @return Toast
     */
    public static Toast make(String text)
    {
        return Toast.makeText(Easy.getContext(), text, Toast.LENGTH_SHORT);
    }

    /**
     * 创建LENGTH_LONG Toast并返回
     *
     * @param text Toast文本
     * @return Toast
     */
    public static Toast makeLong(String text)
    {
        return Toast.makeText(Easy.getContext(), text, Toast.LENGTH_LONG);
    }

    /**
     * 显示Toast
     *
     * @param text Toast文本
     */
    public static void show(String text)
    {
        make(text).show();
    }

    /**
     * 显示LENGTH_LONG Toast
     *
     * @param text Toast文本
     */
    public static void showLong(String text)
    {
        makeLong(text).show();
    }

    /**
     * 创建Toast并返回
     *
     * @param id string id
     * @return Toast
     */
    public static Toast make(@StringRes int id)
    {
        return Toast.makeText(Easy.getContext(), id, Toast.LENGTH_SHORT);
    }

    /**
     * 创建LENGTH_LONG Toast并返回
     *
     * @param id string id
     * @return Toast
     */
    public static Toast makeLong(@StringRes int id)
    {
        return Toast.makeText(Easy.getContext(), id, Toast.LENGTH_LONG);
    }

    /**
     * 显示Toast
     *
     * @param id string id
     */
    public static void show(@StringRes int id)
    {
        make(id).show();
    }

    /**
     * 显示LENGTH_LONG Toast
     *
     * @param id string id
     */
    public static void showLong(@StringRes int id)
    {
        makeLong(id).show();
    }
}
