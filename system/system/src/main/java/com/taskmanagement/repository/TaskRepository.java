package com.taskmanagement.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.taskmanagement.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long>
{
	List<Task> findByUserName(String user);
	
}



