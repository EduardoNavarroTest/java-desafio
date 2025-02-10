import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = new ArrayList<>();

        // Creación de los objetos
        Persona persona = new Persona("Ramón", "Valdez");
        Persona persona2 = new Persona("Florinda", "Meza");
        Persona persona3 = new Persona("Carlos", "Villagrán");
        Persona persona4 = new Persona("Ruben", "Aguirre");
        Persona persona5 = new Persona("Maria Antonieta", "De las Nieves");

        // Agregando los objetos a la lista
        personas.add(persona);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        //Se recorre la lista y se imprime de acuerdo a lo solicitado
        System.out.println(" **************** Lista ordenada por nombre ****************");
        Collections.sort(personas, Comparator.comparing(Persona::getNombre));
        for (Persona p : personas) {
            System.out.println(p);
        }

        System.out.println(" **************** Lista ordenada por apellido ****************");
        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        for (Persona p : personas) {
            System.out.println(p);
        }

        System.out.println(" **************** Lista ordenada por apellido inverso ****************");
        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed());
        for (Persona p : personas) {
            System.out.println(p);
        }

    }
}
