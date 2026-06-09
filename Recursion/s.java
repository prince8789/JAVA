import java.util.*;
public class s {
    public static String Remove(String st , char ch, int idx){
        if(idx>=st.length()){
            return "";
        }
        String smallAns=Remove(st,ch,idx+1);
        char currchar = st.charAt(idx);
        if(currchar!=ch){
            return currchar+smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(Remove(st, ch, 0));
    }
    
}
