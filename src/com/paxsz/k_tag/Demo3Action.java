package com.paxsz.k_tag;

import com.opensymphony.xwork2.ActionSupport;

public class Demo3Action extends ActionSupport {
	
	private String name;
	public String execute() throws Exception {
		System.out.println(name);
		
		this.addActionError("郝强勇!你错了!!!!");
		
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
