package com.mycompany.geradordesenhas;

import static com.mycompany.geradordesenhas.Senhas.gerarSenha;

public class GeradordeSenhas {

        
     public static void main(String[] args) {
        // Definindo o comprimento da senha desejada
        int comprimentoSenha = 12;
        
        // Gerando e exibindo a senha
        String senhaGerada = gerarSenha(comprimentoSenha);
        System.out.println("Senha gerada: " + senhaGerada);
    }
}   
        
    

