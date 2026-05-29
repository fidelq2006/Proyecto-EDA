/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.proyectoeda;

public class HashTabla {
   private HashNode[] tabla;
    private final int M = 5000; // El tamaño de la tabla es EXACTAMENTE 5,000
    private final int R = 4999; // Número primo menor a M para el segundo hash
    private int cantidadElementos;

    public HashTabla() {
        this.tabla = new HashNode[M];
        this.cantidadElementos = 0;
    }

    // Primera función Hash
    private int hash1(int key) {
        return Math.abs(key) % M;
    }

    // Segunda función Hash (el salto)
    private int hash2(int key) {
        return R - (Math.abs(key) % R);
    }

    // Método para insertar con límite de intentos para evitar bucles infinitos
    public void insertar(int appId, SteamDatos juego) {
        int posicion = hash1(appId);
        int salto = hash2(appId);
        int i = 0;

        // Buscamos casilla libre usando Doble Hashing
        // Ponemos un límite de intentos (M) para que si la tabla se satura o hay bucle, no se cuelgue
        while (tabla[posicion] != null && i < M) {
            // Si el juego ya está en esa posición, no lo duplicamos
            if (tabla[posicion].getAppId() == appId) {
                return;
            }
            posicion = (hash1(appId) + i * salto) % M;
            i++;
        }

        // Si encontramos una casilla vacía antes de agotar los intentos, se guarda
        if (tabla[posicion] == null) {
            tabla[posicion] = new HashNode(appId, juego);
            cantidadElementos++;
        }
        // Si salió del bucle y estaba ocupado (i == M), el juego "ni modo", se quedó fuera.
    }

    // Método para mostrar TODA la tabla (Espacios ocupados y VACÍOS)
    public void mostrarTabla() {
        System.out.println("\n=== INSPECCION DE LA TABLA HASH (TAMAÑO 5000) ===");
        int vacios = 0;
        int ocupados = 0;
        // Recorremos las 5,000 posiciones exactas de la tabla
        for (int i = 0; i < M; i++) {
            if (tabla[i] != null) {
                System.out.println("Posicion [" + i + "] -> OCUPADO | ID: " + tabla[i].getAppId() + " | Juego: " + tabla[i].getJuego().getName());
                ocupados++;
            } else {
                vacios++;
            }
        }

        System.out.println("=================================================");
        System.out.println("RESUMEN DE LA TABLA:");
        System.out.println("Espacios Totales (M): " + M);
        System.out.println("Juegos que lograron entrar: " + ocupados);
        System.out.println("Espacios que se quedaron VACÍOS: " + vacios);
        System.out.println("=================================================\n");
    }

    public int getCantidadElementos() { 
        return cantidadElementos; 
    }
}