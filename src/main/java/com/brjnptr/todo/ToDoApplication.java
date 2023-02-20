package com.brjnptr.todo;

import com.brjnptr.todo.entity.TaskEntity;
import com.brjnptr.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ToDoApplication.class, args);
    }

    @Autowired
    private TodoRepository repo;

    @Override
    public void run(String... args) throws Exception {
        TaskEntity entity = new TaskEntity(1L,"Sorting", "Ordering the existing repositories");
        repo.save(entity);

        TaskEntity entity1 = new TaskEntity(2L,"Cleaning", "Take all the old cd-s and floppy disks out");
        repo.save(entity1);

        TaskEntity entity3 = new TaskEntity(3L,"Cooking", "Put the chicken into the pan");
        repo.save(entity3);
    }
}
