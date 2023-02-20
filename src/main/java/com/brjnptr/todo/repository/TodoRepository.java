package com.brjnptr.todo.repository;

import com.brjnptr.todo.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TaskEntity, Long> {
}
