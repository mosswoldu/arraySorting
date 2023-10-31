package basic.arraySorting.shortway;

import java.util.Arrays;

public class CustomSort {
    public static void main(String[] args) {
        int [] originalArr={9,3,7,-3,2,12,4};
        int [] newArray=customSort(originalArr);
        System.out.println( "Original Array: " + Arrays.toString(originalArr));
        System.out.println("Sorted Array: " +  Arrays.toString(newArray));
    }

    public static int[] customSort(int[]arr){
        int []arr2=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        return arr2;

    }


}
