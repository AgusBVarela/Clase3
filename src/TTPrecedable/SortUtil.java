package TTPrecedable;

public class SortUtil {

    public static <T> void ordenar(Precedable<T>[] arr){
        /* Se ordena por metodo Burbujeo */
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length - 1; j++) {
               if (arr[j + 1].precedeA( (T) arr[j]) == 0) {
                   Precedable<T> aux = arr[j + 1];
                   arr[j + 1] = arr[j];
                   arr[j] = aux;
               }
           }
       }
    }

}
