package com.kh.todoList;

public class TodoListMain {

	public static void main(String[] args) {
		TodoListModel tdmodel = new TodoListModel("복습하기!");
		TodoListView tdview = new TodoListView();
		
		System.out.println(tdmodel.getItem());
		
		tdview.displayTodoList(tdmodel.getItem());
	}

}
