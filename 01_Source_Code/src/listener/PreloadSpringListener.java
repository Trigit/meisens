package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import utils.BeanAccessUtils;

/**
 * @Class Description:将Spring所需的上下文在应用启动时初始化,从而共享一个对象,
 *        并提供销毁时机.
 * @author Boki
 * @Date 2014年12月7日 - 上午12:38:10
 */
public class PreloadSpringListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {

		// 启动时即加载Spring上下文context
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");

		// 将context存储在application域
		event.getServletContext().setAttribute("springContext", context);

		// 为BeanAccessUtils设置context
		BeanAccessUtils.setContext(context);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {

		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext)
				event.getServletContext().getAttribute("springContext");

		if (context != null) {
			context.close();
		}

		event.getServletContext().removeAttribute("springContext");
	}
}
