package com.company;

public class AreaMethode {
    public static void main(String[] args) { /* main nicht vergessen */
        int area = calculateArea(2,5);
        System.out.println(area);
    }


    public static int calculateArea(int width, int length) {
    return width * length;

    }
}