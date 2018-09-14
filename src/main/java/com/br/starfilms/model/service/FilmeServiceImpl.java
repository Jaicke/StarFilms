package com.br.starfilms.model.service;

import com.br.starfilms.model.entity.Filme;
import com.br.starfilms.model.repository.FilmeRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author JAICKE
 */
@Service
public class FilmeServiceImpl implements FilmeService {

    private final FilmeRepository repository;

    public FilmeServiceImpl(FilmeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void salvarFilme(Filme filme) {
        this.repository.save(filme);
    }

    @Override
    public List<Filme> listarFilmes() {
        List<Filme> filmes = new ArrayList<>();
        Iterator<Filme> iterator = this.repository.findAll().iterator();

        while (iterator.hasNext()) {
            filmes.add(iterator.next());
        }

        return filmes;
    }

    @Override
    public void deletarFilme(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Filme buscarFilme(Long id) {
        Optional<Filme> f = this.repository.findById(id);
        return f.get();
    }

}
