package com.quantumflo.Webapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private TodoRepository todoRepository;

    public TodoService( TodoRepository todoRepository ) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findByUsername(String username){
        return todoRepository.findByUsername(username);
    }

    public void addTodo(Todo todo){
        todoRepository.save(todo);
    }

    public void deleteById(int id) {
        todoRepository.deleteById(id);
    }

    public Todo findById(int id) {
        Todo todo = todoRepository.findById(id).get();
        return todo;
    }

    public void updateTodos( Todo updatedTodo) {
        todoRepository.save(updatedTodo);
    }

}
