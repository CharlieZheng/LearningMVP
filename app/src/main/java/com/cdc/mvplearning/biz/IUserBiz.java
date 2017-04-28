package com.cdc.mvplearning.biz;

public interface IUserBiz {
    void login(String username, String password, com.cdc.mvplearning.biz.OnLoginListener loginListener);
}