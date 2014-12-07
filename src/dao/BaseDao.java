package dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import utils.BeanAccessUtils;

/**
 * @Class Description:dao基类
 * @author Boki
 * @Date 2014年12月6日 - 下午1:41:33
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
@Repository
@Scope("prototype")
public class BaseDao {

	// 注解可以无视private
	@Resource
	protected SessionFactory sessionFactory = null;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public List getAll(Class<?> clazz) {
		return getSession().createQuery("from " + clazz.getSimpleName()).list();
	}

	public boolean save(Object po) {
		getSession().save(po);
		return true;
	}

	public <T> T get(Class<T> clazz, Serializable id) {
		return (T) getSession().get(clazz, id);
	}

	public List getByCondition(Class<?> clazz, Map<String, Object> conditionMap) {
		StringBuilder sbuilder = new StringBuilder("from ");
		sbuilder.append(clazz.getSimpleName());
		sbuilder.append(" t where 1 = 1");

		for (String key : conditionMap.keySet()) {
			sbuilder.append(" and t.");
			sbuilder.append(key);
			sbuilder.append(" = :");
			sbuilder.append(key);
			sbuilder.append(" ");
		}

		Query query = getSession().createQuery(sbuilder.toString());

		for (Entry<String, Object> entry : conditionMap.entrySet()) {
			query.setParameter(entry.getKey(), entry.getValue());
		}
		return query.list();
	}
}