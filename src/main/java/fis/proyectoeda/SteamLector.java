
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
                for (int i = 0; i < linea.length; i++) {
        System.out.println(i + " -> " + linea[i]);
    }
        }
        
        reader.close();
        return lista;
    }
}