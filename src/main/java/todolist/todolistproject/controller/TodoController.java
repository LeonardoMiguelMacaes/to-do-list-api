package todolist.todolistproject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import todolist.todolistproject.entity.Todo;
import todolist.todolistproject.service.TodoService;

@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    List<Todo> list() {
        return todoService.list();
    }

    @PutMapping
    List<Todo> update(@RequestBody Todo todo) {
        return todoService.update(todo);
    }

    @PutMapping("/edit/{id}")
    List<Todo> updateById(@PathVariable("id") Long id, @RequestBody Todo todo) {
        return todoService.updateById(id, todo);
    }

    @PatchMapping("/set-status/{id}")
    List<Todo> updateStatus(@PathVariable("id") Long id, @RequestBody Boolean isDone) {
        return todoService.updateStatus(id, isDone);
    }

    @DeleteMapping("/{id}")
    List<Todo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }
    
}
