package com.example.projetocarrosmayaramota01212163.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projetocarrosmayaramota01212163.dominio.Carro;

public interface CarroRepository extends
                                    JpaRepository<Carro, Integer> {
}
