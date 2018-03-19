package com.paxsz.f_api;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 如何在action中获得原生ServletAPI
 */
public class Demo6Action extends ActionSupport {

    private static final String TAG = Demo6Action.class.getSimpleName();

    @Override
    public String execute() throws Exception {
        System.out.println(TAG);

        // 并不推荐
        // 原生request
        HttpServletRequest request = ServletActionContext.getRequest();
        // 原生session
        HttpSession session = request.getSession();
        // 原生response
        HttpServletResponse response = ServletActionContext.getResponse();
        // 原生ServletContext
        ServletContext servletContext = ServletActionContext.getServletContext();

        return SUCCESS;
    }
}
