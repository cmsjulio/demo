package com.example.demo.services;

import com.example.demo.models.entities.Aluno;
import com.example.demo.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    //injecao de dependecia
    @Autowired
    private AlunoRepository alunoRepository;

    public void salvar(Aluno aluno)throws Exception{
        alunoRepository.save(aluno);
    }

    public void atualizar(Aluno aluno)throws Exception{
        alunoRepository.save(aluno);
    }

    public void excluir(Aluno aluno)throws Exception{
        alunoRepository.delete(aluno);
    }

    public List<Aluno> listarTodos()throws Exception{
        return alunoRepository.findAll();
    }
    public Aluno buscarPorId(Long id)throws Exception{
        return alunoRepository.findById(id).get();
    }

    //crud - create, read, update, delete

}
