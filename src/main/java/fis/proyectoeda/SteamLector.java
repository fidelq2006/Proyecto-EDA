
package fis.proyectoeda;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SteamLector { 

    public List<SteamDatos> cargar(String ruta) throws Exception {
        List<SteamDatos> lista = new ArrayList<>();
        CSVReader reader = new CSVReader(new FileReader(ruta));
        
        String[] linea;
        reader.readNext(); // saltar encabezado
        
       while ((linea = reader.readNext()) != null) {
try{
    String nombre = linea[1];
    int positiveReviews =Integer.parseInt(linea[12]);
    int negativeReviews=Integer.parseInt(linea[13]);

    SteamDatos juego = new SteamDatos(0, nombre,"","","","","","","","","",0,positiveReviews,negativeReviews,"","","",0);

    lista.add(juego);
}catch(NumberFormatException e){
}
  }
        
    reader.close();
    return lista;
    }
}