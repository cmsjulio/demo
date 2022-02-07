package com.example.demo.services;

import com.example.demo.models.entities.Escola;
import com.example.demo.repositories.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscolaService {

    //injecao de dependecia
    @Autowired
    private EscolaRepository escolaRepository;

    public void salvar(Escola escola)throws Exception{
        escolaRepository.save(escola);
    }

    public void atualizar(Escola escola)throws Exception{
        escolaRepository.save(escola);
    }

    public void excluir(Escola escola)throws Exception{
        escolaRepository.delete(escola);
    }

    public List<Escola> listarTodos()throws Exception{
        return escolaRepository.findAll();
    }
    public Escola buscarPorId(Long id)throws Exception{
        return escolaRepository.findById(id).get();
    }

    //crud - create, read, update, delete

}
