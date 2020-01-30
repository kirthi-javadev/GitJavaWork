package com.taskmanagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taskmanagement.model.Task;
import com.taskmanagement.repository.TaskRepository;

@Service
public class TaskService implements ITaskService {

	@Autowired
	private TaskRepository todoRepository;

	public List<Task> getTodosByUser(String user) {
		return todoRepository.findByUserName(user);
	}

	public Optional<Task> getTodoById(long id) {
		return todoRepository.findById(id);
	}

	public void updateTodo(Task todo) {
		todoRepository.save(todo);
		
	}

	public void addTodo(String title, String name, String desc, Date targetDate, String assignedTo, String status) {
		todoRepository.save(new Task(title,name,desc,targetDate,assignedTo,status));
		
	}

	public void deleteTodo(long id) {
		Optional<Task> todo = todoRepository.findById(id);
		if (todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
	}

	public void saveTodo(Task todo) {
		todoRepository.save(todo);
		
	}
}

	