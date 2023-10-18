
package com.mycompany.aula;
import java.util.*;

public class autor {
    private String nome;
    private String abreviatura;
    private List<contato> contatos;

    public autor(String nome, String abreviatura) {
        this.nome = nome;
        this.abreviatura = abreviatura;
        this.contatos = new ArrayList<contato>();
    }
    
    public void adcionarContato(String t, String c){
        contato contatoTemporario = new contato(t, c);
        this.contatos.add(contatoTemporario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public List<contato> getContatos() {
        return contatos;
    }


    
    
}
