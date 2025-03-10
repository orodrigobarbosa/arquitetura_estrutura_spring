package io.github.cursoudemy.arquiteturaspring.todo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class TodoValidator {

    private TodoRepository repository;

    public void validar(TodoEntity todo){
        if (existeTodoComDescricao(todo.getDescricao())){
            throw new IllegalArgumentException("Já existe um To-Do com essa Descricao");
        }

    }

    private boolean existeTodoComDescricao(String descricao){
    return repository.existsByDescricao(descricao);
    }
}
