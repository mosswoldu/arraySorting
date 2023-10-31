package basic.arraySorting.shortway;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Method 1 shortest ->using Arrays.sort() method
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

//Method 2 using swap and System.arraycopy
class CustomSort1 {
    public static void main(String[] args) {
        int[] originalArray={7,-10,4,1,6,-2,12,9,0};
        int[]sorted=customSort(originalArray);
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Sorted array: " +Arrays.toString(sorted));
    }

    public static int[] customSort(int[]arr){
        int n= arr.length;
        int[]arr2=new int[n];
        System.arraycopy(arr,0,arr2,0,n);

        for(int i=0;i< n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr2[j]<arr2[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr2[i];
            arr2[i]=arr2[minIndex];
            arr2[minIndex]=temp;
        }
        return arr2;
    }
}

//Method 3 converting the array into arrayList
class CustomSortLongWay {
    public static int[] customSort(int[] arr) {
        // Create a new array to store the sorted values
        int[] arr2 = new int[arr.length];

        // Convert the input array to an ArrayList for easy removal
        List<Integer> arrList = new ArrayList<>();
        for (int value : arr) {
            arrList.add(value);
        }

        // Iterate through the input array to find and remove the minimum values
        for (int i = 0; i < arr.length; i++) {
            // Find the index of the minimum value in the ArrayList
            int minIndex = findMinIndex(arrList);

            arr2[i] = arrList.get(minIndex); // Store the minimum value in the sorted array
            arrList.remove(minIndex); // Remove the minimum value from the ArrayList
        }

        // Return the sorted array
        return arr2;
    }

    // Helper method to find the index of the minimum value in an ArrayList
 public static int findMinIndex(List<Integer> arrayList){
        int minIndex=0;
        for(int i=1;i<arrayList.size();i++){
            if(arrayList.get(i)< arrayList.get(minIndex)){
                minIndex=i;
            }
        }
        return minIndex;
 }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        // Call the customSort method to sort the input array
        int[] sortedArr = customSort(arr);

        // Print the original and sorted arrays
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }
}

