package aspectorientedprogramming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client { 
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		CoreLogicProgram c=(CoreLogicProgram)context.getBean("proxy");
		c.actualLogicProgram();
}
}