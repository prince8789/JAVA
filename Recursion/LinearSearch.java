public class LinearSearch {
    public static boolean Search(int[] arr, int target, int idx){
        if(idx>=arr.length) return false;
        if(arr[idx]==target){
            return true;
        }
        return Search(arr,target,idx+1);
    }
    public static void main(String[] args){
        int[] arr = {1,3,5,6,7,9,3,6,2};
        int target =11;
        System.out.println(Search(arr,target,0));
    }
    
}
