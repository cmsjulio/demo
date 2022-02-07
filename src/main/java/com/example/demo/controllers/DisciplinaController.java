package com.example.demo.controllers;

import com.example.demo.models.entities.Disciplina;
import com.example.demo.models.enums.MensagemEnum;
import com.example.demo.services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplina")

public class DisciplinaController {


    @Autowired
    private DisciplinaService disciplinaService;

    @PostMapping("/salvar")
    public String salvar(@RequestBody Disciplina disciplina){
        try{
            disciplinaService.salvar(disciplina);
            return MensagemEnum.SUCESSO.getValue();
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @PostMapping("/atualizar")
    public String atualizar(@RequestBody Disciplina disciplina){
        try{
            disciplinaService.atualizar(disciplina);
            return MensagemEnum.SUCESSO.getValue();
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/listarTodos")
    public List<Disciplina> listarTodos() throws Exception{
        return disciplinaService.listarTodos();
    }

}
