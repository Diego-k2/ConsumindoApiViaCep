package com.example.ConsumindoViaCep.controller;

import com.example.ConsumindoViaCep.model.entity.CadastroUsuario;
import com.example.ConsumindoViaCep.model.service.CadastroService;
import com.example.ConsumindoViaCep.model.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastraUsuarioServic {

    @Autowired
    CadastroService cadastroService;

    @PostMapping("/verifica")
    public void teste(@RequestParam(value = "nome") String nome, @RequestParam(value = "cep")String cep){
        String ruaNome = EnderecoService.buscaEndereco(cep).getLogradouro();
        String cidadeNome = EnderecoService.buscaEndereco(cep).getBairro();
        String estadoNome = EnderecoService.buscaEndereco(cep).getUf();
        String cepp =  EnderecoService.buscaEndereco(cep).getCep();
        try {
            CadastroUsuario cadastroUsuario = new CadastroUsuario(nome, ruaNome, cidadeNome, estadoNome, cepp);
            cadastroService.salvaUsuario(cadastroUsuario);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
