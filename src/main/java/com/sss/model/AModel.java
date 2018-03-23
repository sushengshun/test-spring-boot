package com.sss.model;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AModel implements BeanNameAware{

	@Value("${test.user.name}")
	private String name ;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		//System.out.println(name);

		//System.out.println(this.name+"-----");
	}

	
	
}
