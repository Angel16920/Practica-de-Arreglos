package org.example;

import java.util.Scanner;

public class Main {
    static String nombres[];
    static float calif[][];
    static int num;
    static int num1;
    static Scanner sc;

    public static void main(String[] args)
    {
        pideInfo();
        recopiloInfo();
    }

    private static void recopiloInfo( )
    {
        float total = 0.0f;
        for (int row = 0; row < num; row++){
            System.out.println("Dame el nombre");
            nombres[row]  =  sc.next();
            total = 0.0f;
            for (int col = 0; col < num1; col++){
                System.out.println("Dame la calificacion" + (col + 1) );
                calif[col][row] = sc.nextFloat();
                total += calif [col][row];
            }
            System.out.println("Promedio es: "+ (total/num1));
            System.out.println(total/num1 >= 6 ? "Aptobado" : "Reprobado");

        }
    }
    private static void pideInfo()
    {
        sc = new Scanner(System.in);
        System.out.println("# de alumnos");
        num = sc.nextInt();
        System.out.println("# de calificacion");
        num1 = sc.nextInt();
        nombres = new String[num];
        calif = new float [num][num1];
    }

}


//cantidad de alumnos
//insertar nombres
        //insertar 10 calificaicones