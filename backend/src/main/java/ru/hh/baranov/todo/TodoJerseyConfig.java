package ru.hh.baranov.todo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.hh.baranov.todo.filters.CORSResponseFilter;
import ru.hh.baranov.todo.resources.TodoResource;

@Configuration
@Import({TodoResource.class, CORSResponseFilter.class})
public class TodoJerseyConfig {
    @Bean
    CORSResponseFilter corsResponseFilter() {
        return new CORSResponseFilter();
    }
}
