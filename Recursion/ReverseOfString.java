import java.util.Scanner;

public class ReverseOfString {
    static String Reverse(String s, int idx){
        if(idx>=s.length()) return "";
        String st ="";
        st=Reverse(s,idx+1);
        return st + s.charAt(idx);
    }
    
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(Reverse(st, 0));
   }
}
