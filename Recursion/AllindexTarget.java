public class AllindexTarget {
    public static void Search(int[] arr, int target, int idx){
        if(idx>=arr.length) return;
        if(arr[idx]==target){
            System.out.print(idx+" ");;
        }
        Search(arr,target,idx+1);
    }
    public static void main(String[] args){
        int[] arr = {1,3,5,6,7,9,3,6,2};
        int target =3;
        Search(arr,target,0);
    }
    
}
