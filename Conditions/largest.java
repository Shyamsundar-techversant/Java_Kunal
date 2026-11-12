import java.util.*;
public class largest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
/* 
        if(a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>a && b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        } */
       int max = Math.max(c,Math.max(a,b));
       System.out.println(max);
    }
}
