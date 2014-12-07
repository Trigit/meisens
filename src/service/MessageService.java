package service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pojo.Message;

@SuppressWarnings("rawtypes")
@Service
@Scope("prototype")
public class MessageService extends BaseService {

	// @Resource(name = "messageDao")
	// private MessageDao dao;

	public Message get(Serializable id) {
		return super.get(Message.class, id);
	}

	public List getByCondition(Map<String, Object> conditionMap) {
		return dao.getByCondition(Message.class, conditionMap);
	}

}
