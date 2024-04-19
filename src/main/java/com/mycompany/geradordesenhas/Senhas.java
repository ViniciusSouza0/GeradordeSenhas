package com.mycompany.geradordesenhas;

import java.security.SecureRandom;


public class Senhas {
    
    // Função para gerar uma senha aleatória
    static String gerarSenha(int comprimento) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=";
        StringBuilder senha = new StringBuilder();
        SecureRandom random = new SecureRandom();
        
        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }
        
        return senha.toString();
    }
    
    
    
}
