package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <Integer>();
        System.out.println("enter the number of elements");
        int size = input.nextInt();
        for (int i=0; i< size; i++){
            System.out.println(i+1+" element");
            list.add(input.nextInt());
        }
        System.out.println("sorting......");
        sort(list);
        for (int i=0; i< size; i++){
            System.out.println(list.get(i));
        }
    }
    public static void sort (ArrayList <Integer> list){
        int j,temp;
        for (int i = 0; i < list.size()-1; i++){
            for (j = 0; j < list.size()-i-1; j++){
                if (list.get(j) > list.get(j + 1)){
                    temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
    }
}
