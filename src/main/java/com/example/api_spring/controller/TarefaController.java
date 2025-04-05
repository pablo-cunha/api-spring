package com.example.api_spring.controller;

import com.example.api_spring.model.Tarefa;
import com.example.api_spring.repository.TarefaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TarefaController {

    private final TarefaRepository repository;

    public TarefaController(TarefaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Tarefa> listTasks() {
        return repository.findAll();
    }

    @PostMapping
    public Tarefa addTask(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    @DeleteMapping
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
