/* This is the code for the classic tower of hanoi problem in Java.
It is famous for utilising dynamic programming.
*/

import java.util.Scanner;

public class Hanoi {
    public static void Hanoi(int n, char A, char B, char C){
        if (n == 1) {
            System.out.printf("Move plate %d from %c to %c\n", n, A, C);
        } else {
            Hanoi(n-1, A, C, B);
            System.out.printf("Move plate %d from %c to %c\n", n, A, C);
            Hanoi(n-1, B, A, C);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of disks you want to move: ");
        int n = scanner.nextInt();
        Hanoi(n, 'A', 'B', 'C');
    }
}