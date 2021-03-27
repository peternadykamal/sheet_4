package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("first side in triangle");
        double s1 = input.nextDouble();
        System.out.println("second side in triangle ");
        double s2 = input.nextDouble();
        System.out.println("third side in triangle ");
        double s3 = input.nextDouble();
        input.nextLine();
        System.out.println("color of triangle");
        String color = input.nextLine();
        System.out.println("is triangle filled? 1=TRUE / 0=FALSE");
        int i = input.nextInt();
        boolean isFilled;
        if(i == 1)  isFilled = true;
        else isFilled = false;

        Triangle T = new Triangle(s1,s2,s3,color,isFilled);
        System.out.println("perimeter = "+T.perimeter());
        System.out.println("area = "+T.area());
        System.out.println("color = "+T.getColor());
        System.out.println("filled = "+ T.isFilled());
    }
}
