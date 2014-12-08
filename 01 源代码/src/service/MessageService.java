package service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pojo.Message;
import dao.MessageDao;

/**
 * @Class Description:处理留言逻辑
 * @author Boki
 * @Date 2014年12月7日 - 下午7:20:03
 */
@SuppressWarnings("rawtypes")
@Service
@Scope("prototype")
public class MessageService extends BaseService {

	@Resource(name = "messageDao")
	private MessageDao messageDao;

	public Message get(Serializable id) {
		return super.get(Message.class, id);
	}

	public List getByCondition(Map<String, Object> conditionMap) {
		return dao.getByCondition(Message.class, conditionMap);
	}

}
