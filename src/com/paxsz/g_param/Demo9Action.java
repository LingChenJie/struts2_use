package com.paxsz.g_param;

import com.opensymphony.xwork2.ActionSupport;
import com.paxsz.bean.User;

/**
 * struts2如何获得参数-方式1
 */
public class Demo9Action extends ActionSupport {

    private static final String TAG = Demo9Action.class.getSimpleName();

    //准备user对象
    private User user;

    @Override
    public String execute() throws Exception {
        System.out.println(TAG);

        System.out.println(user.toString());

        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
