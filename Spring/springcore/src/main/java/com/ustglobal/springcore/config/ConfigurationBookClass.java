package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

@Configuration
public class ConfigurationBookClass {
	@Bean(name="book")
	public Book getBook() {
		Book b = new Book();
		b.setName("gokul");
		b.setPrice(100);
		return b;
	}
	@Bean(name="author")
	public Author getAuthor() {
		Author a = new Author();
		a.setName("hari");
		a.setPenName("flair");
		return a;
	}
}
