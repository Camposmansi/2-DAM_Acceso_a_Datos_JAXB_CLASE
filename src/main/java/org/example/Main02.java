package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class Main02 {
    private static final String MIARCHIVO_XML = "./libreria02.xml";

    public static void main(String[] args) throws JAXBException {

        Libro02 libro1 = new Libro02(
                "Entornos de Desarrollo",
                "Alicia Ramos",
                "Garceta",
                "978-84-1545-297-3");
        Libro02 libro2 = new Libro02(
                "Acceso a Datos",
                "Maria Jesus Ramos",
                "Garceta",
                "978-84-1545-297-3");

        ArrayList<Libro02> listalibros = new ArrayList<>();
        listalibros.add(libro1);
        listalibros.add(libro2);
        Libreria02 libreria02 = new Libreria02(
                listalibros,
                "Pueba de libreria JAXB",
                "Madrid"
        );
        // Creamos el contexto indicando la clase raíz
        JAXBContext context = JAXBContext.newInstance(Libreria02.class);
        //Creamos el Marshaller, convierte el java bean en una cadena XML
        Marshaller m = context.createMarshaller();
        //Formateamos el xml para que quede bien
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // Lo visualizamos con system out
        m.marshal(libreria02, System.out);
        // Escribimos en el archivo
        m.marshal(libreria02, new File(MIARCHIVO_XML));
    }
}
