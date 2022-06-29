package com.example.ConsumindoViaCep.model.service;

import com.example.ConsumindoViaCep.model.entity.CadastroUsuario;
import com.example.ConsumindoViaCep.model.repository.CadastroServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {

    @Autowired CadastroServiceRepository cadastroServiceRepository;

    public void salvaUsuario(CadastroUsuario cadastroUsuario){
        cadastroServiceRepository.save(cadastroUsuario);
    }

    public List<CadastroUsuario> findAllUsers(){
        return cadastroServiceRepository.findAll();
    }
}
