package service;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import dao.BaseDao;

/**
 * @Class Description:提供常用的逻辑处理
 * @author Boki
 * @Date 2014年12月7日 - 下午7:20:55
 */
@Service
@Scope("prototype")
public class BaseService {

	@Resource(name = "baseDao")
	protected BaseDao dao;

	public boolean save(Object po) {
		return dao.save(po);
	}

	public <T> T get(Class<T> clazz, Serializable id) {
		return dao.get(clazz, id);
	}
}
