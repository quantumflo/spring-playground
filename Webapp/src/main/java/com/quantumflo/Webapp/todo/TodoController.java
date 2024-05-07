package com.quantumflo.Webapp.todo;
import java.time.LocalDate;
import java.util.List;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    private TodoService todoService;


    @RequestMapping("todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("xyz");
        model.addAttribute("todos", todos);

        return "listTodos";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model) {
        String username = (String)model.get("name");
        Todo todo = new Todo(0, username, "Default Desc", LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "todo";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

        if(result.hasErrors()) {
            return "todo";
        }
        String username = (String)model.get("name");
        todoService.addTodo(username, todo.getDescription(),
                todo.getTargetDate(), false);
        return "redirect:todos";
    }

    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoService.deleteById(id);
        return "redirect:todos";

    }

    @RequestMapping("update-todo")
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        Todo todo = todoService.findById(id);
        model.addAttribute("todo", todo);
        return "todo";
    }

    @PostMapping("update-todo")
    public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

//        if(result.hasErrors()) {
//            return "todo";
//        }
        String username = (String)model.get("name");
        todo.setUsername(username);
        todoService.updateTodos(todo);
        return "redirect:todos";
    }


}
