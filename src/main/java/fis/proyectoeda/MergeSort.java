
package fis.proyectoeda;

public class MergeSort {
    static void mergesort(int izquierda,int derecha, SteamDatos[] array){
        if(izquierda>=derecha){
            return;
    }
        int mid=(derecha+izquierda)/2;
        mergesort(izquierda,mid,array);
        mergesort(mid+1,derecha,array);
        merge(array,izquierda,mid,derecha);
    }
    static void merge(SteamDatos[]array,int izquierda,int mid,int derecha){
        SteamDatos[] temp= new SteamDatos[derecha-izquierda+1];
        int i=izquierda;
        int j=mid+1;
        int k=0;
    while(i<=mid&&j<=derecha){
     if(array[i].getPositiveReviews() >=array[j].getPositiveReviews()){
        temp[k]=array[i];
        i++;
    }else {
            temp[k]=array[j];
            j++;
            }   
    k++;
    }
    while(i<=mid){
        temp[k]=array[i];
        i++;
        k++;
    }
    while(j<=derecha){
        temp[k]=array[j];
        j++;
        k++;
    }
    for (int a=0;a<temp.length;a++){
        array[izquierda+a]=temp[a];
    }
    }
    
}
