package com.vinicius.taskmanager.controller;

import com.vinicius.taskmanager.entity.Task;
import com.vinicius.taskmanager.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Task> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Task criar(@RequestBody Task task) {
        return repository.save(task);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Task atualizar(@PathVariable Long id, @RequestBody Task novaTask){
        Task task = repository.findById(id).orElseThrow(()-> new RuntimeException("Tarefa não encontrada"));

        task.setTitle(novaTask.getTitle());
        task.setDescription(novaTask.getDescription());
        task.setStatus(novaTask.getStatus());
        task.setPriority(novaTask.getPriority());

        return repository.save(task);
    }
}