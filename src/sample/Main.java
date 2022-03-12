package sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter (Radius) -> ");
        double radius = input.nextDouble();

        System.out.print("Enter (Angel) -> ");
        double a = input.nextDouble();

        new FrameSet(radius, a);
    }
}








