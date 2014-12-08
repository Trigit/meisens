package controller.test;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import pojo.Message;
import controller.BaseAction;

@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class TestUIKit extends BaseAction {

	public String index() {
		List messageList = service.getAll(Message.class);
		request.put("messageList", messageList);
		return SUCCESS;
	}
}
