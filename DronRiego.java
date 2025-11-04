/**
 * Autor: Henry Guzmán
 * Fecha: 03/10/2025
 * Descripción: Ejercicio No. 5 - Poliformismo con Herencia
 * Curso: Programación orientada a objetos
 */

class DronRiego extends Dispositivo implements Accionable, Registrable {
    public DronRiego(int id, String nombre, double consumo) { super(id, nombre, consumo); }
    public void ejecutarAccion() { System.out.println("Dron rociando agua"); }
    public void registrar() { System.out.println("Registro de riego completado"); }
}