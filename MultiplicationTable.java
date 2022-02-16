import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  a number: ");
        int n = s.nextInt();
        int multi;
        System.out.println("Multiplication Table of " + n + " : ");
        for (int i = 1; i <= 10; i++) {
            multi = n * i;
            System.out.println(n + " * " + i + " = " + multi);
        }
    }
}