package com.quantumflo.Webapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "Udemy","Learn AWS",
                LocalDate.now().plusYears(1), false ));
        todos.add(new Todo(2, "Datacamp","Learn DevOps",
                LocalDate.now().plusYears(2), false ));
        todos.add(new Todo(3, "Courseera","Learn Full Stack Development",
                LocalDate.now().plusYears(3), false ));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }

    public void addTodo(String username,String description, LocalDate targetDate, boolean done){
        todos.add(new Todo( todos.size(), username, description, targetDate, done ));
    }

}
