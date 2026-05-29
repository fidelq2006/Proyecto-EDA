
package fis.proyectoeda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProyectoEDA {

    public static void main(String[] args) throws Exception {
    SteamLector loader = new SteamLector();
    List<SteamDatos>lista=loader.cargar("Data/SteamGames.csv");
    HashControlador controladorHash = new HashControlador();
    controladorHash.procesarDatos(lista);

    
    SteamDatos[] array=lista.toArray(new SteamDatos[0]);
    MergeSort.mergesort(0,array.length-1,array);
    System.out.println("Top 10 juegos con mejores resenas");
    for (int i=0;i<10;i++){
        System.out.println((i+1)+"."+array[i].getName()+ "-" + array[i].getPositiveReviews() +" resenas positivas");
    }
    SteamDatos[] array2 = lista.toArray(new SteamDatos[0]);
    QuickSort.quickSort(array2, 0, array2.length - 1);
    System.out.println("Top 10 peores juegos:");
    for (int i = 0; i < 10; i++) {
        System.out.println((i+1) + ". " + array2[i].getName() + " - " + array2[i].getNegativeReviews() + " resenas negativas");
    }
SteamDatos[] array3 = lista.stream()
    .filter(j -> (j.getPositiveReviews() + j.getNegativeReviews()) >= 1000)
    .toArray(SteamDatos[]::new);
Arrays.sort(array3, (a, b) -> Double.compare(b.getRatioAprobacion(), a.getRatioAprobacion()));

System.out.println("Top 10 juegos con mejor ratio de aprobacion:");
for (int i = 0; i < 10; i++) {
    System.out.printf("%d. %s - %.2f%%%n",
        i + 1,
        array3[i].getName(),
        array3[i].getRatioAprobacion()
    );
}
    }
    

}
