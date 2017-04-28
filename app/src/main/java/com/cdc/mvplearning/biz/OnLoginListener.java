package com.cdc.mvplearning.biz;


import com.cdc.mvplearning.bean.User;

public interface OnLoginListener {
    void loginSuccess(User user);

    void loginFailed();
}