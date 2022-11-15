package Biblioteca;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class MisLibrerias {
    private ArrayList<Libreria> misLibrerias;
    private String nombre;

    public ArrayList<Libreria> getMisLibrerias() {
        return misLibrerias;
    }

    public void setMisLibrerias(ArrayList<Libreria> misLibrerias) {
        this.misLibrerias = misLibrerias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public MisLibrerias(ArrayList<Libreria> misLibrerias, String nombre) {
        this.misLibrerias = misLibrerias;
        this.nombre = nombre;
    }

    public MisLibrerias() {
    }
}
