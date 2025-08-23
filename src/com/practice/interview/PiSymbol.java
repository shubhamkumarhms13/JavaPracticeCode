package com.practice.interview;

import java.util.Scanner;

public class PiSymbol {
    public static void main(String[] args) {
        char piSymbol = '\u03C0';
        char square = '\u00B2';
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder series = new StringBuilder();
        for(int i = 1; i <= num; i++){
            series.append("1/").append(i).append(square);
            if(i != num){
                series.append(" + ");
            }
        }
        System.out.println(piSymbol + "" + square + "/6 = " + series);
    }
}
