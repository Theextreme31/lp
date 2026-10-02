package Ejercicio_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- ESCENARIO 1 ----");
        Contenedor<String, Integer> contenedorNotas = new Contenedor<>();
        contenedorNotas.agregarPar("Matematica", 18);
        contenedorNotas.agregarPar("Programacion", 20);
        contenedorNotas.agregarPar("Fisica", 15);

        System.out.println("\nMostrando todos los pares:");
        contenedorNotas.mostrarPares();

        System.out.println("\nObteniendo par en el indice 1:");
        System.out.println(contenedorNotas.obtenerPar(1));


        System.out.println("\n---- ESCENARIO 2 ----");
        Contenedor<Persona, Integer> contenedorPersonas = new Contenedor<>();
        contenedorPersonas.agregarPar(new Persona("Sofia", 19), 101);
        contenedorPersonas.agregarPar(new Persona("Carlos", 22), 102);

        System.out.println("\nMostrando todos los pares:");
        contenedorPersonas.mostrarPares();

        System.out.println("\nRecuperando lista completa con obtenerTodosLosPares():");
        System.out.println("Total de elementos almacenados: " + contenedorPersonas.obtenerTodosLosPares().size());
    }
}