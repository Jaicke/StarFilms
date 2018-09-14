package com.br.starfilms.model.service;

import com.br.starfilms.model.entity.Filme;
import java.util.List;

/**
 *
 * @author JAICKE
 */
public interface FilmeService {

    public void salvarFilme(Filme filme);

    public Filme buscarFilme(Long id);

    public List<Filme> listarFilmes();

    public void deletarFilme(Long id);

}
