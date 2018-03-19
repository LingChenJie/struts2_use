package com.paxsz.f_api;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 如何在action中获得原生ServletAPI
 */
public class Demo7Action extends ActionSupport implements ServletRequestAware {

    private static final String TAG = Demo7Action.class.getSimpleName();
    private HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        System.out.println(TAG);

        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }
}
