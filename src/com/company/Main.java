package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cilindro A = new Cilindro();
        Cilindro B = new Cilindro(1.0,"verde",1.0);
        Cilindro C = new Cilindro(2.0);

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());


    }
}
