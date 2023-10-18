package com.mycompany.aula;
import java.util.*;
public class Aula {

    public static void main(String[] args) {
        System.out.println("Kai Cenat in Ohio skibi gyatt lv 4!");
        
        editora e1 = new editora("edt1", "email");
        editora e2 = new editora("edt2", "e2ail");
        
        autor a1 = new autor("renato","a1");
        autor a2 = new autor("raaaenato","aaa1");
        
        livro l1 = new livro("l1", 2023, e1);
        livro l2 = new livro("lngu", 2001, e2);
        
        a1.adcionarContato("celular", "27997730456");
        a2.adcionarContato("celular", "27997530456");
    }
}
