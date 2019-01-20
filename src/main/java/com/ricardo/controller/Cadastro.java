package com.ricardo.controller;

import com.ricardo.dto.EnderecoDto;
import com.ricardo.feing.CEPFeing;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Cadastro {

    @Autowired
    private CEPFeing cepFeing;

    @Value("${welcome.message}")
    private String msg;

    @RequestMapping("hello/{cep}")
    public EnderecoDto getHello(@PathVariable("cep") String cep) {
        log.info("cremildo");


        EnderecoDto dto = cepFeing.buscaEnderecoPor(cep);
        return dto;
    }






}
