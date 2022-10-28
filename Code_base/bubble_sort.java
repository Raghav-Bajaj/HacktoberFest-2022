public class BubbleSorter {  
    static void bubbleSort(int[] arr) {  
        int s = arr.length;  
        int t = 0;  
         for(int i=0; i < s; i++){  
                 for(int j=1; j < (s-i); j++){  
                          if(arr[j-1] > arr[j]){   
                                 t = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = t;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int array[] ={3,32,59,94,13,28};  
                 
                System.out.println("Array Before Bubble Sort :-");  
                for(int i=0; i < array.length; i++){  
                        System.out.print(array[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(array); 
                 
                System.out.println("Array After Bubble Sort :-");  
                for(int i=0; i < array.length; i++){  
                        System.out.print(array[i] + " ");  
                }  
   
        }  
}  

import java.util.Arrays;

class Main {
  static void bubbleSort(int array[]) {
    int size = array.length;
    // loop over each element of the array to access them
    for (int i = 0; i < size - 1; i++)
      // compare the elements of the array with a loop
      for (int j = 0; j < size - i - 1; j++)
        // compare two adjacent elements in the array
        if (array[j] > array[j + 1]) {
          // Swap if the elements aren't in the right order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String args[]) {
    int[] data = { 5, 3, 4, 1, 2 };
    // call the method using class name
    Main.bubbleSort(data);
    
    System.out.println("Array sorted with bubble sort: ");
    System.out.println(Arrays.toString(data));
  }
}

// Output: Array sorted with bubble sort: [1, 2, 3, 4, 5]