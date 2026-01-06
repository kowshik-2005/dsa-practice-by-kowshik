import java.util.Scanner;

public class Checktwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(n%3==0&&n%5==0){
            System.out.println("divisable by both 3 and 5");
        }else {
            System.out.println("non divisble by 5 and 3");
        }
    }
}
