package com.example.demo.controllers;

import com.example.demo.models.entities.Escola;
import com.example.demo.models.enums.MensagemEnum;
import com.example.demo.services.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escola")

public class EscolaController {


    @Autowired
    private EscolaService escolaService;

    @PostMapping("/salvar")
    public String salvar(@RequestBody Escola escola){
        try{
            escolaService.salvar(escola);
            return MensagemEnum.SUCESSO.getValue();
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @PostMapping("/atualizar")
    public String atualizar(@RequestBody Escola escola){
        try{
            escolaService.atualizar(escola);
            return MensagemEnum.SUCESSO.getValue();
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/listarTodos")
    public List<Escola> listarTodos() throws Exception{
        return escolaService.listarTodos();
    }

}
