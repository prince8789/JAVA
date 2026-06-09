import java.util.*;
public class aliceAndBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2 = sc.nextInt();
        int[] r1 = new int[n2];
        int[] r2 = new int[n2];
        for(int i=0;i<n2;i++){
            r1[i]=sc.nextInt();
        }
        for(int i =0;i<n2;i++){
            r2[i]=sc.nextInt();
        }
        int result =0;
        for(int i=0;i<n2;i++){
            if(r1[i]*2<r2[i] && r2[i]*2<r1[i]){
                result++;
            }
        }
        System.out.println(result);
    }
    
}
