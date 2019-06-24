package com.qa.persistence;

import java.util.HashMap;
import java.util.Map;

public class TodoRepository {

	private Map<Integer, Todo> todoList = new HashMap<>();
	private Integer todoKey = 1;
	
	public int addNewTodoToMyList(Todo addTodo) {
		todoList.put(todoKey, addTodo);
		todoKey ++;
		return todoList.size();
	}

	public int removeTodo(int keyToRemove) {
		todoList.remove(keyToRemove);
		return todoList.size();
	}

}
