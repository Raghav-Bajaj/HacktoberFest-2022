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
