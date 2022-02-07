package com.example.demo.controllers;

import com.example.demo.models.entities.Aluno;
import com.example.demo.models.enums.MensagemEnum;
import com.example.demo.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// controller
@RestController
@RequestMapping("/aluno")

public class AlunoController {


    @Autowired
    private AlunoService alunoService;

    @PostMapping("/salvar")
    public String salvar(@RequestBody Aluno aluno){
        try{
            alunoService.salvar(aluno);
            return MensagemEnum.SUCESSO.getValue();
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @PostMapping("/excluir")
    public String excluir(@RequestBody Aluno aluno){
        try{
            alunoService.excluir(aluno);
            return MensagemEnum.SUCESSO.getValue();
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @PostMapping("/atualizar")
    public String atualizar(@RequestBody Aluno aluno){
        try{
            alunoService.atualizar(aluno);
            return MensagemEnum.SUCESSO.getValue();
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/listarTodos")
    public List<Aluno> listarTodos() throws Exception{
        return alunoService.listarTodos();
    }

}
