package com.example.demo.services;


import com.example.demo.models.entities.Disciplina;
import com.example.demo.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    //injecao de dependecia
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public void salvar(Disciplina disciplina)throws Exception{
        disciplinaRepository.save(disciplina);
    }

    public void atualizar(Disciplina disciplina)throws Exception{
        disciplinaRepository.save(disciplina);
    }

    public void excluir(Disciplina disciplina)throws Exception{
        disciplinaRepository.delete(disciplina);
    }

    public List<Disciplina> listarTodos()throws Exception{
        return disciplinaRepository.findAll();
    }
    public Disciplina buscarPorId(Long id)throws Exception{
        return disciplinaRepository.findById(id).get();
    }

    //crud - create, read, update, delete

}
