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
        todos.add(new Todo( todos.size()+1, username, description, targetDate, done ));
    }

    public void deleteById(int id) {
        //todo.getId() == id
        // todo -> todo.getId() == id
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodos(@Valid Todo updatedTodo) {
        for (int i = 0; i < todos.size(); i++) {
            Todo todo = todos.get(i);
            if( todo.getId() == updatedTodo.getId() ) {
                todos.set(i, updatedTodo);
                break;
            }
        }
    }

}
