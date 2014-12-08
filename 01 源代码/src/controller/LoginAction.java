package controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pojo.Message;
import service.MessageService;

@SuppressWarnings({ "serial", "unused" })
@Component
@Scope("prototype")
public class LoginAction extends BaseAction {

	@Value("wtf")
	private String message;
	@Resource(name = "messageService")
	private MessageService mservice;

	public LoginAction() {
		
	}

	public void setService(MessageService service) {
		this.service = service;
	}

	public String login() {
		Message message2 = mservice.get("3454366575fds7");

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
