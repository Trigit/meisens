package dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import pojo.QueryCondition;

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

	/**
	 * 等值查询
	 * 
	 * @param clazz
	 * @param conditionMap
	 * @return
	 */
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

	/**
	 * 按条件查询
	 * 
	 * @param clazz
	 * @param conditionMap
	 * @return
	 */
	public List getByQueryCondition(Class<?> clazz, Map<String, QueryCondition> conditionMap) {
		StringBuilder sbuilder = new StringBuilder("from ");
		sbuilder.append(clazz.getSimpleName());
		sbuilder.append(" t where 1 = 1");

		for (Entry<String, QueryCondition> entry : conditionMap.entrySet()) {
			String key = entry.getKey();
			QueryCondition condition = entry.getValue();
			sbuilder.append(" and t.");
			sbuilder.append(key);
			sbuilder.append(" ");

			switch (condition.getConditioType()) {
			case EQUALS:
				sbuilder.append("=?");
				break;
			case LIKE:
				sbuilder.append(" like ?");
				break;
			case IN:
				sbuilder.append("in(");
				sbuilder.append(combindParams(condition.getValue()));
				sbuilder.append(")");
				break;
			case BETWEEN:
				sbuilder.append("between(?,?)");
				break;
			case GREATERTHAN:
				sbuilder.append(">?");
				break;
			case LESSTHAN:
				sbuilder.append("<?");
				break;
			case NOTGREATERTHAN:
				sbuilder.append("<=?");
				break;
			case NOTLESSTHAN:
				sbuilder.append(">=?");
				break;
			case NOTIN:
				sbuilder.append("not in(");
				sbuilder.append(combindParams(condition.getValue()));
				sbuilder.append(")");
				break;
			}
		}

		Query query = getSession().createQuery(sbuilder.toString());

		int paramIndex = 0;
		for (QueryCondition condition : conditionMap.values()) {
			switch (condition.getConditioType()) {
			case EQUALS:
			case GREATERTHAN:
			case LESSTHAN:
			case NOTGREATERTHAN:
			case NOTLESSTHAN:
				query.setParameter(paramIndex++, condition.getValue());
				break;
			case LIKE:
				query.setParameter(paramIndex++, "%" + condition.getValue() + "%");
				break;
			case BETWEEN:
			case IN:
			case NOTIN:
				Collection<?> collection = null;
				if (condition.getValue().getClass().isArray()) {
					collection = Arrays.asList((Object[]) condition.getValue());
				} else if (condition.getValue() instanceof Collection<?>) {
					collection = (Collection<?>) condition.getValue();
				}
				if (collection == null) {
					break;
				}
				for (Object item : collection) {
					query.setParameter(paramIndex++, item);
				}
				break;
			}
		}

		return query.list();
	}

	/**
	 * 条件转为"?,"连接的形式
	 * 
	 * @param values
	 * @return
	 */
	private String combindParams(Object values) {
		int size = 0;
		if (values.getClass().isArray()) {
			size = ((Object[]) values).length;
		} else if (values instanceof Collection<?>) {
			size = ((Collection<?>) values).size();
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append("?,");
		}
		if (sb.length() > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}

		return sb.toString();
	}
}