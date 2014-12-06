package controller;

import pojo.Message;
import service.MessageService;

@SuppressWarnings({ "serial", "unused", "rawtypes" })
public class LoginAction extends BaseAction {

	private String message;
	private MessageService service;

	public LoginAction() {
	}

	public void setService(MessageService service) {
		this.service = service;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String login() {
		Message message2 = service.get("3454366575fds7");

		request.put("title", "hala");
		return SUCCESS;
	}

	public String login2() {
		this.addActionMessage("addActionMessage");
		this.addFieldError("errorField", "errorFieldValue");
		// this.doDefault();
		String text = this.getText("sdfds");
		// this.setContainer(null);

		return SUCCESS;
	}

}
