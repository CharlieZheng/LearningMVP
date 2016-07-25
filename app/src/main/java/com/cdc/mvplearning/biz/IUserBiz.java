package com.cdc.mvplearning.biz;

/**
 * Created by zhy on 15/6/19.
 */
public interface IUserBiz {
    public void login(String username, String password, com.cdc.mvplearning.biz.OnLoginListener loginListener);
}