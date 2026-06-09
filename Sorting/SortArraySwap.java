import java.util.*;
public class SortArraySwap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n  = sc.nextInt();
        System.out.println("enter the element of array");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k=-1,l=-1;
        for(int i =1;i<n;i++){
            if(arr[i]<arr[i-1]){
                if(k==-1){
                    k=i;
                    l=i;
                }
                else{
                    l=i;
                }
            }
        }
        int temp =arr[k];
        arr[k]=arr[l];
        arr[l]=temp;
        System.out.println("Array after sorted");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}