package dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import pojo.Message;

public class MessageDao {
	private SessionFactory sessionFactory = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Message get(Serializable id) {
		Session session = sessionFactory.getCurrentSession();
		return (Message) session.get(Message.class, id);
	}
}
