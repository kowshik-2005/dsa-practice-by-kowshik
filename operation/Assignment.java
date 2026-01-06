
import java.util.*;

public class Assignment {
    public static void main(String args[]) {
        int A = 10;

        A += 5;   // A = A + 5 → 15
        System.out.println("After += : " + A);

        A -= 3;   // A = A - 3 → 12
        System.out.println("After -= : " + A);

        A *= 2;   // A = A * 2 → 24
        System.out.println("After *= : " + A);

        A /= 4;   // A = A / 4 → 6
        System.out.println("After /= : " + A);
    }
}
