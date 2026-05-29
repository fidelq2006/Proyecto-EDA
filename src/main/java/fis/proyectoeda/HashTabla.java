/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.proyectoeda;

public class HashTabla {
    private HashNode[] tabla;
    private final int M = 7001; // Tamaño de la tabla 
    private final int R = 6997; // Primo menor para el segundo Hash
    private int cantidadElementos;

    public HashTabla() {
        this.tabla = new HashNode[M];
        this.cantidadElementos = 0;
    }

    // Primera función Hash: determina la posición base
    private int hash1(int key) {
        return Math.abs(key) % M;
    }

    // Segunda función Hash: determina el tamaño del salto (nunca da 0)
    private int hash2(int key) {
        return R - (Math.abs(key) % R);
    }

    // Método para insertar usando DOBLE HASHING
    public void insertar(int appId, SteamDatos juego) {
        if (cantidadElementos >= 5000) {
            // Ya alcanzamos el límite de 5,000 datos solicitados
            return;
        }

        int posicion = hash1(appId);
        int salto = hash2(appId);
        int i = 0;

        // Bucle de resolución de colisiones por Doble Hashing
        while (tabla[posicion] != null) {
            // Si el appId ya existe, no lo duplicamos
            if (tabla[posicion].getAppId() == appId) {
                return;
            }
            // Fórmula del Doble Hashing: (Posición Inicial + i * Salto) % M
            posicion = (hash1(appId) + i * salto) % M;
            i++;
        }

        // Encontramos una casilla libre
        tabla[posicion] = new HashNode(appId, juego);
        cantidadElementos++;
    }

    // Método para buscar un juego por su ID
    public SteamDatos buscar(int appId) {
        int posicion = hash1(appId);
        int salto = hash2(appId);
        int i = 0;

        while (tabla[posicion] != null) {
            if (tabla[posicion].getAppId() == appId) {
                return tabla[posicion].getJuego();
            }
            posicion = (hash1(appId) + i * salto) % M;
            i++;
        }
        return null; // No encontrado
    }

    public int getCantidadElementos() {
        return cantidadElementos;
    }
}