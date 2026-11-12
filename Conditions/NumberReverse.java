import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0,rem;
        while(n>0){
            rem = n%10;
            res = rem+res*10;
            n = n/10;
        }
        System.out.println(res);
    }
}
