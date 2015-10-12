package com.chillax.softwareyard.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Xiao on 2015/9/10.
 */
public class NoteUtils {
    private Context context;
    private SharedPreferences preferences;

    public NoteUtils(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences("Note", 0);
    }

    /**
     * 设置课程备注。
     * 数据格式：
     * key: note-星期几(0-6)-第几节课(0-4)-课程名
     * value:...
     *
     * @param key
     * @param value
     */
    public void setCache(String key, String value) {
        preferences.edit().putString(key, value).commit();
    }

    public String getCache(String key) {
        return preferences.getString(key, null);
    }

    public void clear() {
        preferences.edit().clear().commit();
    }
}
