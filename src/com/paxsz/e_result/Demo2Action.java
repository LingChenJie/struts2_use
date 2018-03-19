package com.paxsz.e_result;

import com.opensymphony.xwork2.ActionSupport;

public class Demo2Action extends ActionSupport {

    private static final String TAG = Demo2Action.class.getSimpleName();

    @Override
    public String execute() throws Exception {
        System.out.println(TAG);
        return SUCCESS;
    }
}
