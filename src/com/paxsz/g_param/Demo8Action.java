package com.paxsz.g_param;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

/**
 * struts2如何获得参数
 * 每次请求Action时都会创建新的Action实例对象
 */
public class Demo8Action extends ActionSupport {

    private static final String TAG = Demo8Action.class.getSimpleName();

    public Demo8Action() {
        super();
        System.out.println(TAG + "被创建了!");
    }

    @Override
    public String execute() throws Exception {
        System.out.println(TAG);

        return SUCCESS;
    }

}
