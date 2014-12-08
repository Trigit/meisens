package pojo;

import enums.QueryConditionType;

public class QueryCondition {

	private QueryConditionType conditioType;
	private Object value;

	public QueryCondition(QueryConditionType conditioType, Object value) {
		super();
		this.conditioType = conditioType;
		this.value = value;
	}

	public QueryConditionType getConditioType() {
		return conditioType;
	}

	public void setConditioType(QueryConditionType conditioType) {
		this.conditioType = conditioType;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
