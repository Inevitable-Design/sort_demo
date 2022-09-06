public class BubbleSort {  
    static void bubbleSort(int[] array1) {  
        int n = array1.length;  
        int t = 0;  
        for(int a=0; a < n; a++){  
                for(int j=1; j < (n-a); j++){  
                        if(array1[j-1] > array1[j]){  
                                t = array1[j-1];  
                                array1[j-1] = array1[j];  
                                array1[j] = t;  
                        }  
                        
                }  
        }  
    }  
    public static void main(String[] args) {  
                int array1[] ={3,60,35,2,45,320,5};  
                
                System.out.println("Array Before Bubble Sort");  
                for(int a=0; a < array1.length; a++){  
                        System.out.print(array1[a] + " ");  
                }  
                System.out.println();  
                
                bubbleSort(array1);
                
                System.out.println("Array After Bubble Sort");  
                for(int a=0; a < array1.length; a++){  
                        System.out.print(array1[a] + " ");  
                }  
        }  
}