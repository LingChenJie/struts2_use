package com.paxsz.g_param;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.paxsz.bean.User;

import java.util.List;
import java.util.Map;

/**
 * struts2 封装集合类型参数
 */
public class Demo11Action extends ActionSupport {

    private static final String TAG = Demo11Action.class.getSimpleName();

    // list
    private List<String> list;

    // map
    private Map<String, String> map;

    @Override
    public String execute() throws Exception {
        System.out.println(TAG);

        System.out.println("list --> " + list);
        System.out.println("map --> " + map);

        return SUCCESS;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
