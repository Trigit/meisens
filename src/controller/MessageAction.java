package controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import pojo.Message;
import service.BaseService;
import service.MessageService;

/**
 * @Class Description:留言管理
 * @author Boki
 * @Date 2014年12月3日 - 上午12:21:47
 */
@SuppressWarnings({ "serial", "rawtypes", "unused" })
@Controller
@Scope("prototype")
public class MessageAction extends BaseAction {

	@Resource(name = "messageService")
	private MessageService service;

	public String search() {
		// get parameters:pagenum,conditions

		// query from service/dao, get then returning list.

		// save them to the jsp-template scope

		// point out the target jsp page

		Message po2 = service.get(Message.class, 345436661);

		Map<String, Object> condition = new HashMap<>();
		List list = service.getByCondition(condition);

		Message po = new Message("不朽", new BigDecimal(454366), "dfd@etretr",
				new BigDecimal(454366), "关于明天", "这挺好的呀");

		service.save(po);

		return SUCCESS;
	}
}
