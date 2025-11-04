/**
 * Autor: Henry Guzmán
 * Fecha: 03/10/2025
 * Descripción: Ejercicio No. 5 - Poliformismo con Herencia
 * Curso: Programación orientada a objetos
 */

class ControladorDispositivos {
    private Catalogo catalogo = new Catalogo();

    /**
     * Funcion del metodo initCatalogo
     * Variables que usa: ninguna
     * Uso resumido: inicializa el catálogo con 10 dispositivos de ejemplo
     * Valor que retorna: void
     */
    public void initCatalogo() {
        catalogo.agregarDispositivo(new SensorSuelo(1, "Sensor de Humedad", 10.5));
        catalogo.agregarDispositivo(new SensorTemperatura(2, "Sensor de Temperatura", 8.0));
        catalogo.agregarDispositivo(new ValvulaRiego(3, "Válvula Principal", 25.0));
        catalogo.agregarDispositivo(new DronRiego(4, "Dron Rociador", 120.0));
        catalogo.agregarDispositivo(new DronMonitoreo(5, "Dron de Monitoreo", 130.0));
        catalogo.agregarDispositivo(new EstacionMeteorologica(6, "Estación Norte", 60.0));
        catalogo.agregarDispositivo(new SensorLuz(7, "Sensor Luminosidad", 9.0));
        catalogo.agregarDispositivo(new CamaraMultiespectral(8, "Cámara Multiespectral", 45.0));
        catalogo.agregarDispositivo(new SensorPH(9, "Sensor de PH", 10.0));
        catalogo.agregarDispositivo(new ValvulaRiego(10, "Válvula Secundaria", 20.0));
    }

    /**
     * Funcion del metodo listarDispositivos
     * Variables que usa: ninguna
     * Uso resumido: muestra todos los dispositivos en consola
     * Valor que retorna: void
     */
    public void listarDispositivos() {
        catalogo.listarDispositivos();
    }

    /**
     * Funcion del metodo buscarPorId
     * Variables que usa: id (int)
     * Uso resumido: busca un dispositivo por su ID y lo muestra
     * Valor que retorna: void
     */
    public void buscarPorId(int id) {
        Dispositivo d = catalogo.buscarPorId(id);
        if (d != null) System.out.println(d);
        else System.out.println("No se encontró el dispositivo.");
    }

    /**
     * Funcion del metodo buscarPorNombre
     * Variables que usa: nombre (String)
     * Uso resumido: busca un dispositivo por su nombre y lo muestra
     * Valor que retorna: void
     */
    public void buscarPorNombre(String nombre) {
        Dispositivo d = catalogo.buscarPorNombre(nombre);
        if (d != null) System.out.println(d);
        else System.out.println("No se encontró el dispositivo.");
    }

    /**
     * Funcion del metodo ordenarPorConsumo
     * Variables que usa: ninguna
     * Uso resumido: ordena y muestra los dispositivos por su consumo eléctrico
     * Valor que retorna: void
     */
    public void ordenarPorConsumo() {
        catalogo.ordenarPorConsumo();
        catalogo.listarDispositivos();
    }
}