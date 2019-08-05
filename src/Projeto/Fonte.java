package Projeto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Fonte {

  private String tipo;

  private int eGerada;



public Fonte(String tipo,int eGerada)
{
    this.tipo=tipo;
    this.eGerada=eGerada;    
}

    @Override
    public String toString() {
        String str="Fonte:\n" + "tipo->" + tipo + "\neGerada->" + eGerada + "\n\n";
        return str;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the eGerada
     */
    public int geteGerada() {
        return eGerada;
    }

    /**
     * @param eGerada the eGerada to set
     */
    public void seteGerada(int eGerada) {
        this.eGerada = eGerada;
    }


}