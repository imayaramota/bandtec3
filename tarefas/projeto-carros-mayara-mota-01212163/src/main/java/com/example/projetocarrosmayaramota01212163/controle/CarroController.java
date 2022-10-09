package com.example.projetocarrosmayaramota01212163.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.projetocarrosmayaramota01212163.dominio.Carro;
import com.example.projetocarrosmayaramota01212163.repositorio.CarroRepository;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {
    @Autowired
    private CarroRepository repository;

    @PostMapping
    public ResponseEntity<Carro> post(@RequestBody Carro novoCarro) {
        repository.save(novoCarro);
        return ResponseEntity.status(201).body(novoCarro);
    }

    @GetMapping
    public ResponseEntity<List<Carro>> get() {
        List<Carro> lista = repository.findAll(); // faz um "select * from" da tabela
        return lista.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> get(@PathVariable int id) {
        return ResponseEntity.of(repository.findById(id));
    }
}
