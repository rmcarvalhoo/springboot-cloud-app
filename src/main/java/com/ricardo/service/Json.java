package com.ricardo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ricardo.dto.PessoaDto;

public class Json {

    public void gerar() {
        String str = "{ \"nick\" : \"cremildo da silva sauro\", \"old\" : 56}";

        ObjectMapper mapper = new ObjectMapper();
        PessoaDto dto = new PessoaDto();
        try{
            dto = mapper.readValue(str, PessoaDto.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("oi " + dto.toString());
    }


    public static void main(String a[]) {
        Json j = new Json();
        j.gerar();
    }

}
