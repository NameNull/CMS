package cn.yjava.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.yjava.web.action.admin.AdminAction;

/**
 * 
 * @title Test 
 * @description 测试类 
 * @author 俞杰
 * @time 2015年8月23日-下午6:12:00
 * @version 1.0.0
 * @since JDK1.7
 */
public class Test {
	public static void main(String[] args) throws SQLException {
		/*IContentDao contentDao=new ContentDaoImpl();
		contentDao.save(null);*/
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		AdminAction adminAction=context.getBean("adminAction",AdminAction.class);
		adminAction.loginValidate();
	}
}
