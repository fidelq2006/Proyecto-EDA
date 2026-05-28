/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fis.proyectoeda;

/**
 *
 * @author aitan
 */
public class ProyectoEDA {

    public static void main(String[] args) throws Exception {
    SteamLector loader = new SteamLector();
    loader.cargar("Data/SteamGames.csv");
}
}