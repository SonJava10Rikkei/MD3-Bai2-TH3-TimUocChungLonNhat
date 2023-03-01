package rikkei.âcdemy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a");
        a = input.nextInt();
        System.out.println("Nhap so b");
        b = input.nextInt();
        a = Math.abs(a); // su dung abs() de tra ve gia tri tuyet doi (phan duong) cua a, b
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            if (a == 0) {
                System.out.println("Uoc chung lon nhat la : " + b);
            } else {
                System.out.println("Uoc chung lon nhat la : " + a);
            }
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                    System.out.println("a = " + a);
                } else {
                    b = b - a;
                    System.out.println("b = " + b);
                }
            }
        }
        System.out.println("Uoc chung lon nhat " + a);
    }
}
