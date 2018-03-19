package com.paxsz.j_interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

// 拦截器:第一种创建方式
// 拦截器生命周期:随项目的启动而创建,随项目关闭而销毁
public class MyInterceptor1 implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        return null;
    }
}
