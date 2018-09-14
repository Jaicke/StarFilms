package com.br.starfilms.controller;

import com.br.starfilms.model.entity.Filme;
import com.br.starfilms.model.service.FilmeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author JAICKE
 */
@Controller
@RequestMapping("/filme")
public class FilmeController {

    private final FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        
        model.addAttribute("filmes", filmeService.listarFilmes());

        return "/filme/listafilme";
    }

    @GetMapping("/{id}/editar")
    public String editar(@PathVariable("id") Long id, Model model) {

        model.addAttribute("filme", filmeService.buscarFilme(id));

        return "/filme/cadastrofilme";

    }

    @GetMapping("/{id}/excluir")
    public String excluir(@PathVariable("id") Long id) {

        filmeService.deletarFilme(id);

        return "redirect:/filme/listar";
    }

    @GetMapping("/novo")
    public String novo(Model model) {

        model.addAttribute("filme", new Filme());

        return "/filme/cadastrofilme";
    }

    @PostMapping("/salvar")
    public String salvar(Filme filme) {

        filmeService.salvarFilme(filme);

        return "redirect:/filme/listar";
    }
}
