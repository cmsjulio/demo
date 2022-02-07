package com.example.demo.controllers;

import com.example.demo.models.entities.Avaliacao;
import com.example.demo.models.enums.MensagemEnum;
import com.example.demo.services.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacao")

public class AvaliacaoController {


    @Autowired
    private AvaliacaoService avaliacaoService;

    @PostMapping("/salvar")
    public String salvar(@RequestBody Avaliacao avaliacao){
        try{
            avaliacaoService.salvar(avaliacao);
            return MensagemEnum.SUCESSO.getValue();
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @PostMapping("/atualizar")
    public String atualizar(@RequestBody Avaliacao avaliacao){
        try{
            avaliacaoService.atualizar(avaliacao);
            return MensagemEnum.SUCESSO.getValue();
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/listarTodos")
    public List<Avaliacao> listarTodos() throws Exception{
        return avaliacaoService.listarTodos();
    }

}
