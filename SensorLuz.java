/**
 * Autor: Henry Guzmán
 * Fecha: 03/10/2025
 * Descripción: Ejercicio No. 5 - Poliformismo con Herencia
 * Curso: Programación orientada a objetos
 */

class SensorLuz extends Dispositivo implements Medible {
    public SensorLuz(int id, String nombre, double consumo) { super(id, nombre, consumo); }
    public double medir() { return Math.random() * 1000; }
}