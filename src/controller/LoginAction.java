package controller;

import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.apache.struts2.interceptor.RequestAware;

import utils.QueryUtils;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings({ "serial", "unused" })
public class LoginAction extends BaseAction {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String login() {
		this.addActionMessage("addActionMessage");
		this.addFieldError("errorField", "errorFieldValue");
		// this.doDefault();
		String text = this.getText("sdfds");
		// this.setContainer(null);
		request.put("title", "hala");
		return SUCCESS;
	}

	public String login2() {
		
		return SUCCESS;
	}

}
