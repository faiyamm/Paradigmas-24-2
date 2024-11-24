package UNIDAD3.U3_E27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        

        Function<String, Integer> sizeOf = (String s) -> {
            return s.length();
        };

        Integer r1= sizeOf.apply("Me canso ganso");
        System.out.println("Cantidad de caracteres: " + r1);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "John", "Mariam", "Alex", "Mohammado", "Mohammado", "Vincent", "Alex", "Alex"));
        ArrayList<String> filtrado = new ArrayList<>(Arrays.asList("uno", "dos", "tres"));

        System.out.println("\n-----------------forEach normal-----------------");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\n-----------------forEach con función lambda-----------------");
        // names.forEach(name->System.out.println(name));
        names.forEach(elem->System.out.println(elem));
        System.out.println("\n-----------------forEach función lambda abreviado-----------------");
        names.forEach(System.out::println);

        // usando filtros
        System.out.println("\n--------------Filtrar los que tienen O-----------------");
        names.stream().filter(name-> name.contains("o")).forEach(System.out::println);

        // usando la arraylist filtrado
        System.out.println("\n--------------Filtrado por partes-----------------");
        filtrado = (ArrayList<String>) names.stream().filter(name-> name.contains("o")).collect(Collectors.toList());
        filtrado.forEach(elem -> System.out.println(elem));
        System.out.println("\n-----------------Filtrar Alex-----------------");
        names.stream().filter(name-> name.equals("Alex")).forEach(System.out::println);

        System.out.println("\n-----------------Filtrar los que empiezan con A-----------------");
        names.stream().filter(name-> name.startsWith("A")).forEach(System.out::println);

        System.out.println("\n-----------------Usando Sorted-----------------");
        names.stream()
        .sorted(Comparator.naturalOrder())
        //.sorted(Comparator.reverseOrder())
        .forEach(System.out::println);

        System.out.println("\n-----------------Usando Sorted 2-----------------");
        names.stream()
        .sorted(Comparator.comparing(String::length))
        .forEach(System.out::println);

        System.out.println("\n-----------------Usando Map-----------------");
        List<Persona> people = new ArrayList<>(Arrays.asList(
            new Persona(1, "Jenni", "Rivera", "jennirivera.com", "mujer", 44),
            new Persona(2, "Maria", "Lopez", "marialopez.com", "mujer", 56)
        ));

        List<Persona> personas = people.stream().map(person -> {
            Persona persona = new Persona(2, "Sofia", "Perez", "sofiaperez.com", "mujer", 22);
                    persona.setId(person.getId());
                    persona.setNombre(person.getNombre());
                    persona.setApellido(person.getApellido());
                    persona.setCorreo(person.getCorreo());
                    persona.setGenero(person.getGenero());
                    persona.setEdad(person.getEdad());
                    return persona;
        }).collect(Collectors.toList());
        personas.forEach(persona -> {
            System.out.println(persona.toString());
        });

    leer.close();
    }
}
