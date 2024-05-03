import java.io.Console;

public class LargestIndex {

    static int getLargestIndex(int[] arr){
        int max = 0;
        
        for(int x : arr){
            if( x > max ){
                max = x;
            }
        }

        return max;
    }

    static int getLargestIndexAlt(int[] arr){
        int max = 0;
        
        for(int i = 0; i < arr.length; i++){
            if( arr[i] > max ){
                max = arr[i];
            }
        }

        return max;
    }

    static void outputLargest(int num){
        System.out.println("The largest number is : " + num);
    }

    public static void main(String[] args) {
        int[] first = {23, 10, 53};
        int[] second = {54, 100, 23, 102};

        outputLargest(getLargestIndex(first));
        outputLargest(getLargestIndexAlt(second));
    }
}
