package org.example;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Libreria02 {
    private ArrayList<Libro02> listaLibro;
    private String nombre;
    private String lugar;

    public Libreria02(ArrayList<Libro02> listaLibro,
                      String nombre,
                      String lugar) {
        super();
        this.listaLibro = listaLibro;
        this.nombre = nombre;
        this.lugar = lugar;
    }

    public Libreria02() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    //Wrapper, envoltura alrededor la representación XML
    @XmlElementWrapper(name = "ListaLibro") //
    @XmlElement(name = "Libro")
    public ArrayList<Libro02> getListaLibro() {
        return listaLibro;
    }

    public void setListaLibro(ArrayList<Libro02> listaLibro) {
        this.listaLibro = listaLibro;
    }
}
