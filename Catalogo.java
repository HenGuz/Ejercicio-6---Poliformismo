/**
 * Autor: Henry Guzmán
 * Fecha: 03/10/2025
 * Descripción: Ejercicio No. 5 - Poliformismo con Herencia
 * Curso: Programación orientada a objetos
 */

class Catalogo {
    private List<Dispositivo> dispositivos = new ArrayList<>();

    public void agregarDispositivo(Dispositivo d) { dispositivos.add(d); }

    public void listarDispositivos() { dispositivos.forEach(System.out::println); }

    public Dispositivo buscarPorId(int id) {
        for (Dispositivo d : dispositivos) if (d.getId() == id) return d;
        return null;
    }

    public Dispositivo buscarPorNombre(String nombre) {
        for (Dispositivo d : dispositivos) if (d.getNombre().equalsIgnoreCase(nombre)) return d;
        return null;
    }

    public void ordenarPorConsumo() { Collections.sort(dispositivos); }
}