/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.proyectoeda;

public class HashNode {
    private int appId;
    private SteamDatos juego;

    public HashNode(int appId, SteamDatos juego) {
        this.appId = appId;
        this.juego = juego;
    }

    public int getAppId() { 
        return appId; 
    }
    
    public SteamDatos getJuego() { 
        return juego; 
    }
}