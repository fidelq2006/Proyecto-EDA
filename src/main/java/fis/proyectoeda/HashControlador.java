/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.proyectoeda;

import java.util.List;

public class HashControlador {
    private HashTabla tablaHash;

    public HashControlador() {
        this.tablaHash = new HashTabla();
    }

    public void procesarDatos(List<SteamDatos> listaJuegos) {
        int intentos = 0;
        
        for (SteamDatos juego : listaJuegos) {
            if (intentos >= 5000) {
                break; // Solo tomamos los primeros 5,000 del CSV para el experimento
            }
            
            tablaHash.insertar(juego.getAppId(), juego);
            intentos++;
        }
        
        System.out.println("---(DOBLE HASHING) ---");
        System.out.println("Proceso de insercion finalizado.");
    }

    public void mostrarEstructura() {
        tablaHash.mostrarTabla();
    }
}