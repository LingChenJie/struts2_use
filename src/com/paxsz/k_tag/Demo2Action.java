package com.paxsz.k_tag;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class Demo2Action extends ActionSupport {

    @Override
    public String execute() throws Exception {

        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("jerry");
        list.add("jack");
        list.add("rose");
        list.add("hqy");

        ActionContext.getContext().put("list", list);

        return SUCCESS;
    }
}
