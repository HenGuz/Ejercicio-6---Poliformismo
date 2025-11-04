/**
 * Autor: Henry Guzmán
 * Fecha: 03/10/2025
 * Descripción: Ejercicio No. 5 - Poliformismo con Herencia
 * Curso: Programación orientada a objetos
 */

abstract class Dispositivo implements Comparable<Dispositivo> {
    protected int id;
    protected String nombre;
    protected double consumoElectrico;

    public Dispositivo(int id, String nombre, double consumoElectrico) {
        this.id = id; this.nombre = nombre; this.consumoElectrico = consumoElectrico;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getConsumoElectrico() { return consumoElectrico; }

    @Override
    public int compareTo(Dispositivo o) { return Double.compare(this.consumoElectrico, o.consumoElectrico); }

    @Override
    public String toString() { return getClass().getSimpleName() + " [ID=" + id + ", Nombre=" + nombre + ", Consumo=" + consumoElectrico + "]"; }
}