import java.util.*;
public class SelectionSort{
    static void Selection_sort(int[] arr , int n ){
        for(int i =0;i<n;i++){
            int min = i;
            for(int j =i;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        System.out.println("sorted array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n  = sc.nextInt();
        System.out.println("enter the element of array");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Selection_sort(arr, n);
        
    }
}