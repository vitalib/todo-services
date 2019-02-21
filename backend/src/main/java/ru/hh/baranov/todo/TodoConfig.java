package ru.hh.baranov.todo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.hh.baranov.todo.dao.TodoDAOInMemory;
import ru.hh.baranov.todo.services.TodoService;
import ru.hh.nab.starter.NabProdConfig;

@Configuration
@Import(NabProdConfig.class)
public class TodoConfig {

    @Bean
    public TodoDAOInMemory todoDAOInMemory() {
        return new TodoDAOInMemory();
    }

    @Bean
    public TodoService todoService(){
        return new TodoService();
    }

}
