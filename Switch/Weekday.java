import java.util.*;
public class Weekday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch (day) {
/*             case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working day");
                break;
            case 6 : 
            case 7 : 
                System.out.println("Week off");
                break;
        
            default:
                break; */
            case 1,2,3,4,5 -> System.out.println("Working days");
            case 6,7 -> System.out.println("Week off");
        }
    }
}
