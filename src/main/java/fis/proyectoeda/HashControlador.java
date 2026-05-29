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
        int insertados = 0;
        
        for (SteamDatos juego : listaJuegos) {
            if (insertados >= 5000) {
                break; // Frenamos al llegar a los 5,000 datos exigidos
            }
            
            // Insertamos usando el appId (columna numérica)
            tablaHash.insertar(juego.getAppId(), juego);
            insertados++;
        }
        
        System.out.println("---DOBLE HASHING ---");
        System.out.println("Estructura cargada con éxito.");
        System.out.println("Cantidad de datos numéricos (appId) almacenados: " + tablaHash.getCantidadElementos());
    }
}