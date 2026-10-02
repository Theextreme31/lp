package Ejercicio_4;

import java.util.Objects;
public class Par<F, S> {
    private F primero;
    private S segundo;

    public Par(F primero, S segundo) {
        if (primero == null || segundo == null) {
            throw new NullPointerException("Los elementos del par no pueden ser nulos");
        }
        this.primero = primero;
        this.segundo = segundo;
    }

    public F getPrimero() {
        return primero;
    }

    public void setPrimero(F primero) {
        if (primero == null) {
            throw new NullPointerException("El primer elemento no puede ser nulo");
        }
        this.primero = primero;
    }

    public S getSegundo() {
        return segundo;
    }

    public void setSegundo(S segundo) {
        if (segundo == null) {
            throw new NullPointerException("El segundo elemento no puede ser nulo");
        }
        this.segundo = segundo;
    }

    public boolean esIgual(Par<F, S> otroPar) {
        if (this == otroPar) return true;
        if (otroPar == null) return false;
        return Objects.equals(this.primero, otroPar.primero) && Objects.equals(this.segundo, otroPar.segundo);
    }

    @Override
    public String toString() {
        return "(Primero: " + primero + ", Segundo: " + segundo + ")";
    }
}