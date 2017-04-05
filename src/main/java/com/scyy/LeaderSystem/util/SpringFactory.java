package com.scyy.LeaderSystem.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFactory {
	
	public static ApplicationContext context = null;
	
	private SpringFactory(){
		
	}
	
	public static ApplicationContext getInstance(){
		if(context ==  null){
			context = new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");
		}
		return context;
	}
}
