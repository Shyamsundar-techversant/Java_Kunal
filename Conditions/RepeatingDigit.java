import java.util.Scanner;

public class RepeatingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int count = 0,rem;
        while(n > 0){
            rem = n%10;
            n = n/10;
            if(rem == num){
                count ++;
            }
        }
        System.out.println(count);
    }
}
