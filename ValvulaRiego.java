/**
 * Autor: Henry Guzmán
 * Fecha: 03/10/2025
 * Descripción: Ejercicio No. 5 - Poliformismo con Herencia
 * Curso: Programación orientada a objetos
 */

class ValvulaRiego extends Dispositivo implements Accionable {
    public ValvulaRiego(int id, String nombre, double consumo) { super(id, nombre, consumo); }
    public void ejecutarAccion() { System.out.println("Válvula abierta"); }
}