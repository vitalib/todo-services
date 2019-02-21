package ru.hh.baranov.todo.dao;

import ru.hh.baranov.todo.dto.TodoDTO;
import ru.hh.baranov.todo.entities.Todo;

import java.util.List;

public interface TodoDAOInterface {

    public Todo save(TodoDTO todoDTO);

    public void clearAll();

    public Todo getById(String id);

    public Todo deleteById(String id);

    public List<Todo> getAll();

    public Todo updateById(String id, TodoDTO todoDTO);
}
