package com.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.Employee;
import com.cg.SBU;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myBeans.xml");
//		Employee e = (Employee)ctx.getBean("emp");
		SBU e = (SBU) ctx.getBean("sbu");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(e.findEmployee(a));
		}

}
