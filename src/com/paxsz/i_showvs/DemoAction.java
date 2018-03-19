package com.paxsz.i_showvs;

import com.opensymphony.xwork2.ActionSupport;

public class DemoAction extends ActionSupport {

    private static final String TAG = DemoAction.class.getSimpleName();

    @Override
    public String execute() throws Exception {

        System.out.println(TAG);

        return SUCCESS;
    }
}
