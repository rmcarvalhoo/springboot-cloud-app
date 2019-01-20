package com.ricardo.feing;

import com.ricardo.dto.EnderecoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://viacep.com.br/ws/", name = "viacep")
public interface CEPFeing {

    @GetMapping("{cep}/json")
    EnderecoDto buscaEnderecoPor(@PathVariable("cep") String cep);

}
