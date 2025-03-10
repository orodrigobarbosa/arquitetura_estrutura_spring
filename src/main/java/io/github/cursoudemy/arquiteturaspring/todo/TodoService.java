package io.github.cursoudemy.arquiteturaspring.todo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoService {

    private TodoRepository todoRepository;
    private TodoValidator validator;
    private MailSender mailSender;


    public TodoEntity salvar(TodoEntity novo) {
        validator.validar(novo);
        return todoRepository.save(novo);
    }

    public void atualizarStatus(TodoEntity todo) {
        todoRepository.save(todo);
        String status = Boolean.TRUE.equals(todo.getConcluido()) ? "Concluído" : "Não Concluído";
        mailSender.enviar("To-do foi atualizado para " + status);
    }


    public TodoEntity buscarPorId(Integer id) {
        return todoRepository.findById(id).orElse(null);

    }
}
