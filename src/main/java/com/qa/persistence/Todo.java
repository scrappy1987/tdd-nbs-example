package com.qa.persistence;

public class Todo {
	
	//instance variables
	private String name;

	//constructor
	public Todo(String name) {
		this.name = name;
	}
	
	//methods
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Todo [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

}
