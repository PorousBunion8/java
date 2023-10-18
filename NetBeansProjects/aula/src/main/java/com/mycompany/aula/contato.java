
package com.mycompany.aula;
import java.util.*;

public class contato {
    private String tipo;
    private String contato;

    public contato(String tipo, String contato) {
        this.tipo = tipo;
        this.contato = contato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
}
