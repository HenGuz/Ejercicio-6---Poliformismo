/**
 * Autor: Henry Guzmán
 * Fecha: 03/10/2025
 * Descripción: Ejercicio No. 5 - Poliformismo con Herencia
 * Curso: Programación orientada a objetos
 */

class DronMonitoreo extends Dispositivo implements Registrable {
    public DronMonitoreo(int id, String nombre, double consumo) { super(id, nombre, consumo); }
    public void registrar() { System.out.println("Imágenes capturadas"); }
}