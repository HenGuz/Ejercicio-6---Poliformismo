/**
 * Autor: Henry Guzmán
 * Fecha: 03/10/2025
 * Descripción: Ejercicio No. 5 - Poliformismo con Herencia
 * Curso: Programación orientada a objetos
 */

class EstacionMeteorologica extends Dispositivo implements Medible, Registrable {
    public EstacionMeteorologica(int id, String nombre, double consumo) { super(id, nombre, consumo); }
    public double medir() { return 15 + Math.random() * 10; }
    public void registrar() { System.out.println("Datos meteorológicos guardados"); }
}