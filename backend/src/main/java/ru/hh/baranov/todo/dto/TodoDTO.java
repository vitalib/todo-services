package ru.hh.baranov.todo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.BeanUtils;
import ru.hh.baranov.todo.entities.Todo;

import javax.xml.bind.annotation.XmlRootElement;

@JsonIgnoreProperties(value = {"createdAt"})
@XmlRootElement
public class TodoDTO {

    private String title;
    private String id;
    private Boolean completed;

    public TodoDTO(Todo todo) {
        BeanUtils.copyProperties(todo, this);
    }

    public TodoDTO() {

    }

    public TodoDTO(String title) {
        this.title = title;
    }

    public TodoDTO(String title, String id, Boolean completed) {
        this.title = title;
        this.id = id;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
