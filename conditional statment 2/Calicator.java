import java.util.*;
public class Calicator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr a:");
        int a=sc.nextInt();
        System.out.println("eneter b:");
        int b=sc.nextInt(); 
        System.out.println("eneter operator :");
        char operator=sc.next().charAt(0);
    switch (operator) {
        case '+' :System.out.println(a+b);
            
            break;
            case '-' :System.out.println(a-b);
            
            break;
            case '*' :System.out.println(a*b);
            
            break;
            case '/' :System.out.println(a/b);
            
            break;
            case '%' :System.out.println(a%b);
            
            break;
        default:System.out.println("my calicator is not that adavance");
          
    }
    }
}
