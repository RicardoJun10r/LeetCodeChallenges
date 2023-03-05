import java.util.Arrays;

public class Solution {

    public void merge(int[] array1, int sizeArray1, int[] array2, int sizeArray2) {
        
        int[]novoArray = new int[sizeArray1+sizeArray2];
        for(int i = 0; i < (sizeArray1); i++){
            novoArray[i] = array1[i];
        }
        int cont = 0;
        for(int i = sizeArray1; i < (sizeArray1+sizeArray2); i++){
            novoArray[i] = array2[cont];
            cont++;
        }
        for(int i = 0; i < (sizeArray1+sizeArray2); i++){
            array1[i] = novoArray[i];
        }

        Arrays.sort(array1);
    }
}