/**
 * Autor: Henry Guzmán
 * Fecha: 03/10/2025
 * Descripción: Ejercicio No. 5 - Poliformismo con Herencia
 * Curso: Programación orientada a objetos
 */

class SensorPH extends Dispositivo implements Medible {
    public SensorPH(int id, String nombre, double consumo) { super(id, nombre, consumo); }
    public double medir() { return 6 + Math.random() * 2; }
}