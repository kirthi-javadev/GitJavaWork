package com.taskmanagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import com.taskmanagement.model.Task;

public interface ITaskService 
{
	List<Task> getTodosByUser(String user);
	Optional<Task> getTodoById(long id);
	void updateTodo(Task todo);
	void addTodo(String title,String name, String desc, Date targetDate, String assignedTo,String status);
	void deleteTodo(long id);
	void saveTodo(Task todo);
}