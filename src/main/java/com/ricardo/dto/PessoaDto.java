package com.ricardo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PessoaDto {

    @JsonProperty("nick")
    private String nome;

    @JsonProperty("old")
    private Integer idade;
}
