package com.tasksapi.tasks_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class service {

    @Autowired
    private repository taskRepository;

    public List<model> listarTodas() {
        return taskRepository.findAll();
    }

    public model buscarPorId(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    public model criar(model task) {
        return taskRepository.save(task);
    }

    public model atualizar(Long id, model taskAtualizada) {
        model task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
        task.setTitulo(taskAtualizada.getTitulo());
        task.setDescricao(taskAtualizada.getDescricao());
        task.setStatus(taskAtualizada.getStatus());
        return taskRepository.save(task);
    }

    public void deletar(Long id) {
        if (!taskRepository.existsById(id)) {
            throw new RuntimeException("Tarefa não encontrada");
        }

        taskRepository.deleteById(id);
    }


}