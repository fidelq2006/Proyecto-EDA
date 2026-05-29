
package fis.proyectoeda;


public class QuickSort {
  //arreglar recursivamente
static void quickSort(SteamDatos[] array, int izquierda, int derecha) {
    if (izquierda >= derecha) return;
    int pivoteIndex = division(array, izquierda, derecha);
    quickSort(array, izquierda, pivoteIndex - 1);
    quickSort(array, pivoteIndex + 1, derecha);
    }

static int division(SteamDatos[] array, int izquierda, int derecha) {
        int pivote = array[derecha].getNegativeReviews();
        int i = izquierda - 1;

        for (int j = izquierda; j < derecha; j++) {
            if (array[j].getNegativeReviews() >= pivote) {
                i++;
                SteamDatos temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        SteamDatos temp = array[i + 1];
        array[i + 1] = array[derecha];
        array[derecha] = temp;

        return i + 1;
    }
}