package org.example;

public class ComparacaoString {
    public static void main(String[] args) {

       String nome1 = "Daniel";
       String nome2 = "Daniel";
       String nome3 = new String("Daniel");

       String res;

       res = (nome1==nome3)?"O nome1 é exatamente igual ao nome2":"O nome1 é diferente do nome3";

       System.out.println(res);

    }
}