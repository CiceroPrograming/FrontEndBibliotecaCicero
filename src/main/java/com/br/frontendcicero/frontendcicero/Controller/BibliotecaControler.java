package com.br.frontendcicero.frontendcicero.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BibliotecaControler {

    @GetMapping("/loginUsuario")
    public String login() {
        return "loginUsuario";
    }

    @GetMapping("/cadastroUsuario")
    public String cadadastro() {
        return "cadastroUsuario";
    }

    @GetMapping("/listaLivro")
    public String lista() {
        return "listaLivro";
    }

}
