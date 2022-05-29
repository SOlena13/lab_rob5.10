package com.company;

public class Task4 {
    public Task4() {
    }

    public static void main(String[] args) {
        int c = 1;

        for(int a = 1; a <= 10; ++a) {
            c *= a;
        }

        System.out.println("10! =" + c);
    }
}
