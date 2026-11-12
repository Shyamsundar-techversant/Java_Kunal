import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1:
                System.out.println("Shyam");
                break;
            case 2:
                System.out.println("sundar");
                break;
            case 3:
                System.out.println("sree");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "QA":
                        System.out.println("QA department");
                        break;
                    case "PM":
                        System.out.println("PM department");
                        break;
                
                    default:
                        System.out.println("No department is entered");
                        break;// break is optional because default is the last case
                }
                break;
        
            default:
                System.out.println("No employee id entered");
                break;
        }
    }
}
