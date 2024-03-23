package todolist.todolistproject.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;
import todolist.todolistproject.entity.Todo;
import todolist.todolistproject.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by("done").ascending().and(Sort.by("priority")).ascending()
        .and(Sort.by("name")).ascending();
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> updateById(Long id, Todo todo) {
        Todo taskToBeUpdated = todoRepository.findById(id).orElse(null);

        if(taskToBeUpdated != null) {
            taskToBeUpdated.setName(todo.getName());
            taskToBeUpdated.setDescription(todo.getDescription());
            taskToBeUpdated.setPriority(todo.getPriority());

            todoRepository.save(taskToBeUpdated);
        }
        return list();
    }

    public List<Todo> updateStatus(Long id, Boolean isDone) {
        Todo taskToBeUpdated = todoRepository.findById(id).orElse(null);

        if(taskToBeUpdated != null) {
            taskToBeUpdated.setDone(isDone);

            todoRepository.save(taskToBeUpdated);
        }
        return list();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}
