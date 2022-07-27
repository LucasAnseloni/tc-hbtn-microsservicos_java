package com.song.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas() {
        return "Bem vindo a API de numeros aleatórios para a Mega Sena";
    }


    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {
        Random random = new Random();
        TreeSet<Integer> numeros = new TreeSet<Integer>();
        while (numeros.size() < 6)
            numeros.add(random.nextInt(60) + 1);
        return numeros.stream().collect(Collectors.toList());
    }
}
