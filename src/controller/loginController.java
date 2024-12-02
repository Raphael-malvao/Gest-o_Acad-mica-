package com.example.schoolmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // Mapeamento para exibir a tela de login
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Retorna o nome do arquivo HTML (login.html)
    }

    // Mapeamento para processar o login
    @PostMapping("/login")
    public String handleLogin(@RequestParam("username") String username,
                              @RequestParam("password") String password) {
        // Lógica de autenticação simples (modifique conforme necessário)
        if ("admin".equals(username) && "admin123".equals(password)) {
            // Redireciona para a tela principal ou página de sucesso
            return "redirect:/main";  // O mapeamento para a tela principal
        } else {
            // Redireciona para a tela de login novamente com uma mensagem de erro
            return "redirect:/login?error=true";
        }
    }
}
