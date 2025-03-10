package io.github.cursoudemy.arquiteturaspring.todo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoService {

    private TodoRepository todoRepository;
    
    public TodoEntity salvar(TodoEntity novo) {
        return todoRepository.save(novo);
    }

    public void atualizarStatus(TodoEntity todo) {
        todoRepository.save(todo);
    }

    public TodoEntity buscarPorId(Integer id) {
        return todoRepository.findById(id).orElse(null);

    }
}
