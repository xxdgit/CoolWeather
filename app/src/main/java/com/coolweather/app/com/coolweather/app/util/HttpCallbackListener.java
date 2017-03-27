package com.coolweather.app.com.coolweather.app.util;

/**
 * Created by j on 2017/3/26.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
