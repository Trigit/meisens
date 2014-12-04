package controller;

import utils.QueryUtils;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings({ "serial", "unused" })
public class LoginAction extends ActionSupport {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String onLogin() {
		return LOGIN;
	}

	public String login() {
		
		
		
		return LOGIN;
	}
}
