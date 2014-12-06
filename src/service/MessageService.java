package service;

import java.io.Serializable;

import pojo.Message;
import dao.MessageDao;

public class MessageService {
	MessageDao dao;

	public void setDao(MessageDao dao) {
		this.dao = dao;
	}

	public Message get(Serializable id) {
		return dao.get(id);
	}
}
