package project1.artifact1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main (String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans.xml");
    	App AppObject=(App) context.getBean("appObject");
    	
    	System.out.println(AppObject.ComponentAObject.my_int2);
	}
}
