package utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Class Description:在不受Spring管理的类中使用Bean
 * @author Boki
 * @Date 2014年12月7日 - 上午11:53:04
 */
public class BeanAccessUtils {

	private static ClassPathXmlApplicationContext context;

	public static void setContext(ClassPathXmlApplicationContext context) {
		BeanAccessUtils.context = context;
	}

	/**
	 * 
	 * @param beanName
	 * @return
	 */
	public static Object getBean(String beanName) {
		return context.getBean(beanName);
	}
}