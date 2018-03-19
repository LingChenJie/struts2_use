package com.paxsz.f_api;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * 如何在action中获得原生ServletAPI
 */
public class Demo5Action extends ActionSupport {

    private static final String TAG = Demo5Action.class.getSimpleName();

    @Override
    public String execute() throws Exception {
        System.out.println(TAG);

        // request域=> map (struts2并不推荐使用原生request域)
        // 不推荐
        Map<String, Object> requestScope = (Map<String, Object>) ActionContext.getContext().get("request");
        // 推荐
        ActionContext.getContext().put("name", "requestParam");
        // session域 => map
        Map<String, Object> sessionScope = ActionContext.getContext().getSession();
        sessionScope.put("name", "sessionParam");
        // application域 => map
        Map<String, Object> applicationScope = ActionContext.getContext().getApplication();
        applicationScope.put("name", "applicationParam");

        return SUCCESS;
    }
}
