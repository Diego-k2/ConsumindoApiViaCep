package com.example.ConsumindoViaCep.model.service;

import com.example.ConsumindoViaCep.model.entity.Endereco;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoService {



    public static Endereco buscaEndereco(String cep){

        cep = cep.replace("[^0-9]+", "");

        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        RestTemplate restTemplate = restTemplateBuilder.build();

        String URL = "https://viacep.com.br/ws/" + cep +"/json/";

        Endereco endereco = restTemplate.getForObject(URL, Endereco.class);

        return endereco;

    }


}
