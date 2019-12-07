package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ConfigurationBookClass;
import com.ustglobal.springcore.config.HelloConfigurationClass;
import com.ustglobal.springcore.di.Book;

public class AnnotationBookApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBookClass.class);
		Book b = context.getBean(Book.class);
		System.out.println(Book.class);
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		
		System.out.println(b.getAuthor().getName());
		System.out.println(b.getAuthor().getPenName());
		context.close();
	}
}
