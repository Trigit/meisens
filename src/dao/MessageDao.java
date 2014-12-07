package dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import pojo.Message;

@SuppressWarnings("rawtypes")
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