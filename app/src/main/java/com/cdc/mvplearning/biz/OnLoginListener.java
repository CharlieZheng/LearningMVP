package com.cdc.mvplearning.biz;


import com.cdc.mvplearning.bean.User;

/**
 * Created by zhy on 15/6/19.
 */
public interface OnLoginListener {
    void loginSuccess(User user);

    void loginFailed();
}