package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee;
import com.HelloWorld;
//import com.HelloWorld;

public class HelloMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myBeans.xml");
		
		  Employee e = (Employee) ctx.getBean("emp");
		  e.printEmployee();
		 
		/*
		 * HelloWorld h = (HelloWorld)ctx.getBean("hello"); HelloWorld h1 =
		 * (HelloWorld)ctx.getBean("hello"); h.setName("Puding"); h1.setName("jaffa");
		 * System.out.println(h.sayHello()); System.out.println(h1.sayHello());
		 */
		
	}

}
