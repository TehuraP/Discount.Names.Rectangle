package com.company;

public class Discount {
    public static void main(String[] args) {
        boolean senior = false;
        boolean dog = true;
        boolean student = true;

        System.out.println("bus discount  " + (senior || dog || student));

        int nonFictionBook = 2;
        int FictionBook =  0;
        System.out.println("Discount " + (nonFictionBook > 2 && FictionBook >1));

        int alcoholic = 1;
        int nonAlcoholic=3 ;
        System.out.println(nonAlcoholic >=1 && alcoholic == 0 );

    }
}
