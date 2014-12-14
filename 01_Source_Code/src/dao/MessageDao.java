package dao;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import pojo.Message;

@Repository
@Scope("prototype")
public class MessageDao extends BaseDao {

	public Message get(Serializable id) {
		return super.get(Message.class, id);
	}

	public void save(Message message) {
		getSession().save(message);
	}
}