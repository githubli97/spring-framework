package lihang;

import lihang.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = applicationContext.getBean("user", User.class);
		System.out.println(user.toString());
	}
}
