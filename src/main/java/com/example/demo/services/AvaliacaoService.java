package com.example.demo.services;


import com.example.demo.models.entities.Avaliacao;
import com.example.demo.repositories.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {

    //injecao de dependecia
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public void salvar(Avaliacao avaliacao)throws Exception{
//        avaliacao.setData();
        avaliacaoRepository.save(avaliacao);
    }

    public void atualizar(Avaliacao avaliacao)throws Exception{
        avaliacaoRepository.save(avaliacao);
    }

    public void excluir(Avaliacao avaliacao)throws Exception{
        avaliacaoRepository.delete(avaliacao);
    }

    public List<Avaliacao> listarTodos()throws Exception{
        return avaliacaoRepository.findAll();
    }
    public Avaliacao buscarPorId(Long id)throws Exception{
        return avaliacaoRepository.findById(id).get();
    }

    //crud - create, read, update, delete

}
