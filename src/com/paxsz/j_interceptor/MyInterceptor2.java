package com.paxsz.j_interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

// 创建方式2: 继承AbstractInterceptor -> struts2的体贴
// 帮我们空实现了init 和 destory方法. 我们如果不需要实现这两个方法,就可以只实现intercept方法
public class MyInterceptor2 extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        return null;
    }
}
