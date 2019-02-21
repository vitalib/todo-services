package ru.hh.baranov.todo.services;

import org.springframework.beans.BeanUtils;
import ru.hh.baranov.todo.dao.TodoDAOInMemory;
import ru.hh.baranov.todo.dto.TodoDTO;
import ru.hh.baranov.todo.entities.Todo;
import ru.hh.baranov.todo.exceptions.TodoNotFoundException;

import javax.inject.Inject;
import java.util.List;

public class TodoService {

    @Inject
    private TodoDAOInMemory todoDAOInMemory;

    public List<Todo> findAll() {
        return todoDAOInMemory.getAll();
    }

    public TodoDTO save(TodoDTO todoDTO) {
        Todo savedTodo = todoDAOInMemory.save(todoDTO);
        return new TodoDTO(savedTodo);
    }

    public TodoDTO findById(String id) {
        Todo todo = todoDAOInMemory.getById(id);
        if (todo == null) {
            throw new TodoNotFoundException(String.format("Todo with id = %s does not exists", id));
        } else {
            TodoDTO todoDTO = new TodoDTO();
            BeanUtils.copyProperties(todo, todoDTO);
            return todoDTO;
        }
    }

    public TodoDTO update(String id, TodoDTO todoDTO) {
        Todo updatedTodo = todoDAOInMemory.updateById(id, todoDTO);
        if (updatedTodo == null) {
            throw new TodoNotFoundException(String.format("Todo with id = %s does not exists", id));
        } else {
            return new TodoDTO(updatedTodo);
        }
    }

    public void deleteById(String id) {
        Todo todo = todoDAOInMemory.deleteById(id);
        if (todo == null) {
            throw new TodoNotFoundException(String.format("Todo with id = %s does not exists", id));
        }
    }

}
