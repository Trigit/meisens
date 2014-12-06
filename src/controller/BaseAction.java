package controller;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class BaseAction extends ActionSupport implements RequestAware, SessionAware,
		ApplicationAware {

	protected Map<String, Object> request;
	protected Map<String, Object> session;
	protected Map<String, Object> application;

	protected Object service;

	static private ClassPathXmlApplicationContext context;
	static {
		Map<String, Object> applicationContext = ActionContext.getContext().getApplication();
		context = (ClassPathXmlApplicationContext) applicationContext.get("springContext");
	}

	public BaseAction() {
		// String className = this.getClass().getSimpleName();
		// CharSequence head = className.subSequence(0, 1);
		// String tail = className.substring(1);
		// String serviceName = head.toString().toLowerCase() + tail;
		// String possibleServiceName = serviceName.replace("Action", "Service");
		// try {
		// service = context.getBean(possibleServiceName);
		// } catch (BeansException ex) {
		// service = null;
		// }
	}

	protected Object getBean(String beanName) {
		return context.getBean(beanName);
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

}
