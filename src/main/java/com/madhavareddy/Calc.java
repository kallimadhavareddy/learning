package com.madhavareddy;

import java.util.Random;

import static java.lang.Math.random;

public class Calc{
    public static void main (String args[]){
        long num1 = 155555885509999000l;
        long num2 = 155255252829999000l;

        for(int i =0; i <10; i++){
            Random rand = new Random();
            int random = rand.nextInt();
            Random rand2 = new Random();
            int random2 = rand2.nextInt();

            System.out.println(random + " + " + random2+"=="+(random+random2));
        }
        Long result = num1+num2;
        System.out.println(result);
    }
}

