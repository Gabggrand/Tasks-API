package com.tasksapi.tasks_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class controller {

    @Autowired
    private service taskService;

    @GetMapping
    public List<model> listarTodas() {
        return taskService.listarTodas();
    }

    @GetMapping("/{id}")
    public model buscarPorId(@PathVariable Long id) {
        return taskService.buscarPorId(id);
    }

    @PostMapping
    public model criar(@RequestBody model task) {
        return taskService.criar(task);
    }

    @PutMapping("/{id}")
    public model atualizar(@PathVariable Long id, @RequestBody model task) {
        return taskService.atualizar(id, task);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        taskService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}