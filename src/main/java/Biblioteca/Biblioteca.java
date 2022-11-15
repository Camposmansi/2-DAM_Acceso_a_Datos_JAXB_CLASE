package Biblioteca;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class Biblioteca {
    private static final String MIARCHIVO_XML = ".\\src\\main\\java\\Biblioteca\\Biblioteca.xml";

    public static void main(String[] args) throws JAXBException {

        // Se crean las Variables
        Libreria libreria = new Libreria();
        Libreria libreria2 = new Libreria();
        MisLibrerias misLibrerias = new MisLibrerias();

        // Se crean los ArrayList
        ArrayList<Libros> listalibros = new ArrayList<Libros>();
        ArrayList<Libros> listalibros2 = new ArrayList<Libros>();
        ArrayList<Libreria> librerias = new ArrayList<Libreria>();

        // Se crea la lista de Libros
        Libros libro1 = new Libros(
                "Entornos de Desarrollo",
                "Alicia Ramos",
                "Garceta",
                "978-84-1545-297-3");
        Libros libro2 = new Libros(
                "Acceso a Datos",
                "Maria Jesus Ramos",
                "Garceta",
                "978-84-1545-297-3");
        Libros libro3 = new Libros(
                "libro3",
                "Nombre libro3",
                "Editorial libro3",
                "ISDN libro3");
        Libros libro4 = new Libros(
                "libro4",
                "Nombre libro4",
                "Editorial libro4",
                "ISDN libro4");
        Libros libro5 = new Libros(
                "libro5",
                "Nombre libro5",
                "Editorial libro5",
                "ISDN libro5");

        // Lista de Librerias
        libreria.setNombre("Libreria1");
        libreria.setLugar("Madrid");

        libreria2.setNombre("Libreria2");
        libreria2.setLugar("Toledo");

        libreria.setLibreria(listalibros);
        libreria2.setLibreria(listalibros2);

        listalibros.add(libro1);
        listalibros.add(libro2);
        listalibros2.add(libro3);
        listalibros2.add(libro4);
        listalibros2.add(libro5);

        librerias.add(libreria);
        librerias.add(libreria2);

        misLibrerias.setMisLibrerias(librerias);

        // Creamos el contexto indicando la clase raíz
        JAXBContext context = JAXBContext.newInstance(MisLibrerias.class);
        //Creamos el Marshaller, convierte el java bean en una cadena XML
        Marshaller m = context.createMarshaller();
        //Formateamos el xml para que quede bien
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // Lo visualizamos con system out
        m.marshal(misLibrerias, System.out);
        // Escribimos en el archivo
        m.marshal(misLibrerias, new File(MIARCHIVO_XML));

    }
}
