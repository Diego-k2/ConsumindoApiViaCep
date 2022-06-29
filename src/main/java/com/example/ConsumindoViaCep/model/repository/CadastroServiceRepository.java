package com.example.ConsumindoViaCep.model.repository;

import com.example.ConsumindoViaCep.model.entity.CadastroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroServiceRepository extends JpaRepository<CadastroUsuario, Long> {
}
