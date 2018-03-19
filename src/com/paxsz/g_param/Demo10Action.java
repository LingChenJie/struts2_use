package com.paxsz.g_param;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.paxsz.bean.User;

/**
 * struts2如何获得参数-方式2
 */
public class Demo10Action extends ActionSupport implements ModelDriven<User> {

    private static final String TAG = Demo10Action.class.getSimpleName();

    //准备user 成员变量
    private User user = new User();

    @Override
    public String execute() throws Exception {
        System.out.println(TAG);

        System.out.println(user.toString());

        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }
}
