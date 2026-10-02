package Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Contenedor<F, S> {
    private List<Par<F, S>> listaPares;

    public Contenedor() {
        this.listaPares = new ArrayList<>();
    }

    public void agregarPar(F primero, S segundo) {
        Par<F, S> nuevoPar = new Par<>(primero, segundo);
        this.listaPares.add(nuevoPar);
    }

    public Par<F, S> obtenerPar(int indice) {
        if (indice < 0 || indice >= listaPares.size()) {
            throw new IllegalArgumentException("Indice fuera de rango: " + indice);
        }
        return listaPares.get(indice);
    }

    public List<Par<F, S>> obtenerTodosLosPares() {
        return new ArrayList<>(listaPares); 
    }

    public void mostrarPares() {
        if (listaPares.isEmpty()) {
            System.out.println("El contenedor esta vacio");
            return;
        }
        for (int i = 0; i < listaPares.size(); i++) {
            System.out.println("Indice " + i + ": " + listaPares.get(i));
        }
    }
}