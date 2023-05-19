package com.br.frontendcicero.frontendcicero.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BibliotecaControler {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
