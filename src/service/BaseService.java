package service;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import dao.BaseDao;

@Service
@Scope("prototype")
public class BaseService {

	@Resource(name = "baseDao")
	BaseDao dao;

	public boolean save(Object po) {
		return dao.save(po);
	}

	public <T> T get(Class<T> clazz, Serializable id) {
		return dao.get(clazz, id);
	}
}
