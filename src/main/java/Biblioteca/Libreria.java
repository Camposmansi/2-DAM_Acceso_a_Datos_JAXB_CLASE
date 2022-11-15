package Biblioteca;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

@XmlRootElement()
@XmlType(propOrder = {"nombre", "lugar", "libreria"})
public class Libreria {
    private ArrayList<Libros> libreria;
    private String nombre;
    private String lugar;

    public Libreria(ArrayList<Libros> libreria, String nombre, String lugar) {
        super();
        this.libreria = libreria;
        this.nombre = nombre;
        this.lugar = lugar;
    }

    public Libreria() {
    }

    @XmlElementWrapper(name = "MiListaLibrOS")
    @XmlElement(name = "Libro")
    public ArrayList<Libros> getLibreria() {
        return libreria;
    }

    public void setLibreria(ArrayList<Libros> libreria) {
        this.libreria = libreria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
