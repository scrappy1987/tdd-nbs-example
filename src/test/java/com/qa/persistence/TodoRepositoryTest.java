package com.qa.persistence;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TodoRepositoryTest {

	private Todo feedCat;
	private TodoRepository todoList;
	private Todo emailTadas;
	
	@Before
	public void setup() {
		feedCat = new Todo("feedcat");
		todoList = new TodoRepository();
		emailTadas = new Todo("emailTadas");
	}
	
	@Test
	public void addAnNewTodoToMyListTest() {
		addOneTodoToList();
		addSecondTodoToList();
	}

	
	@Test
	public void removeTodoFromMyTodoListTest() {
		addOneTodoToList();
		addSecondTodoToList();
		removeOneTodoToList();
		
	}

	private void removeOneTodoToList() {
		int removeSize = todoList.removeTodo(1);
		Assert.assertEquals(1, removeSize);
	}
	
	private void addOneTodoToList() {
		int todoListSize = todoList.addNewTodoToMyList(feedCat);
		Assert.assertEquals(1, todoListSize);
	}
	

	private void addSecondTodoToList() {
		int todoListSize2 = todoList.addNewTodoToMyList(emailTadas);
		Assert.assertEquals(2, todoListSize2);
	}

}
