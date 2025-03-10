package io.github.cursoudemy.arquiteturaspring.todo;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@AllArgsConstructor
@RestController
@RequestMapping("/todo")
public class TodoController {


    private TodoService service;

    @PostMapping
    public TodoEntity addTodo(@RequestBody TodoEntity todo) {
        try {
            return this.service.salvar(todo);
        }catch (IllegalArgumentException e){
            var mensagemErro = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, mensagemErro);
        }
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") Integer id, @RequestBody TodoEntity todo) {
        todo.setId(id);


        service.atualizarStatus(todo);
    }

    @GetMapping("/{id}")
    public TodoEntity buscarPorId(@PathVariable("id") Integer id) {
        return service.buscarPorId(id);
    }
}
