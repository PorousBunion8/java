package com.mycompany.aula;


import java.util.*;

/**
 *
 * @author alunolab07
 */
public class livro {
    private String titulo;
    private int anoFundacao;
    private List<autor> autores;
    private editora edt;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public List<autor> getAutores() {
        return autores;
    }

    public livro(String titulo, int anoFundacao, editora edt) {
        this.titulo = titulo;
        this.anoFundacao = anoFundacao;
        this.edt = edt;
        this.autores = new ArrayList<autor>();
    }

    public editora getEdt() {
        return edt;
    }

    public void setEdt(editora edt) {
        this.edt = edt;
    }

    public void adcionarAutor(autor a){
        this.autores.add(a);
    }
    
     public void removerAutor(autor a){
        this.autores.remove(a);
    }
    
    
}
