
/**
 * Write a description of class Merge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Merge
{
    // instance variables - replace the example below with your own
    private static int[] aux;

    /**
     * Constructor for objects of class Merge
     */
    public static void sort(int[] arr){
        aux = new int[arr.length];
        sort(arr, 0, arr.length-1);
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private static void sort(int[] arr, int lo, int hi){
        
        if(lo < hi){
            int mid = lo + (hi - lo)/2;
            sort(arr, lo, mid);
            sort(arr, mid + 1, hi);
            merge(arr, lo, mid, hi);
        }
    }
    public static void merge(int[] arr, int lo, int mid, int hi){
        for(int i = lo; i <= hi; i++){//copying arr to aux
            aux[i] = arr[i];
        }
        
        int i = lo;
        int j = mid + 1;
        int k = lo;
        while(i <= mid && j <= hi){
            if(aux[i]<= aux[j]){
                arr[k] = aux[i++];
                
                
            } else{
                arr[k] = aux[j++];
                
            }
            k++;
        }
        while(i <= mid){
            arr[k] = aux[i++];
            k++;
        }
        
    
    }
}