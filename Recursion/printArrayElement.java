public class printArrayElement {
    static void Display(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        Display(arr,idx+1);
        
    }

    static int PrintMaxValueinArr(int[]arr ,int idx){
        if(idx==arr.length-1) return arr[idx];
        int small_answer = PrintMaxValueinArr(arr, idx+1);
        return Math.max(small_answer,arr[idx]);
    }
    static int sumofArr(int[] arr, int idx){
        if(idx==arr.length-1) return arr[idx];
        return arr[idx]+sumofArr(arr,idx+1);
     }
    static boolean Search(int[] arr, int target , int idx){
        if(idx>=arr.length) return false;
        if(arr[idx]==target) return true;
        return Search(arr,target,idx+1);
        
    }



    static int SearchwithIndex(int[] arr, int target , int idx){
        if(idx>=arr.length) return -1;
        if(arr[idx]==target) return idx;
        return SearchwithIndex(arr,target,idx+1);
        
    }    
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,8,4,5,7,9,98,7,29,36,80,66};
        Display(arr,0);
        System.out.println();
        System.out.println("the maximum element in this array is ");
        System.out.println(PrintMaxValueinArr(arr,0));
        System.out.println(sumofArr(arr, 0));

        System.out.println("the given result exist or not in array ");
        if(Search(arr, 70, 0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.println(SearchwithIndex(arr,98,0));
    }
    
}
