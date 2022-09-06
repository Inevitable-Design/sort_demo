import java.util.*;
public class newsort
{
	public static void main(String[] args) {
		int arr[] ={12,67,32,82,10,2,7,23,78,90,56,12,24,76,78,56};
		int n = arr.length;
		for(int i=1;i<n;i++){
		    int b = i-1;
		    int key = arr[i];
		    while(b>=0 && arr[b]>key)  arr[b+1] = arr[b--];
		    arr[b+1] = key;
		}
      
		System.out.println(Arrays.toString(arr));
	}
}
