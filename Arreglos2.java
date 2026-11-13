package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class Arreglos2
{
    public static void main(String[] args)
    {
        //Codgio para formar el cuadrado
        Scanner sc = new Scanner(System.in);
        int[][] bi = new int[2][2];
        int[] arr = new int[4];
        int i;
        System.out.println("Ingrese cuatro numeros: ");
        for (int fila = 0; fila < bi.length; fila++)
        {
            for (int col = 0; col < bi[fila].length; col++)
            {
                bi[fila][col] = sc.nextInt();
            }
        }
 //Código para que los numeros se acomoden en los espacios del cuadrado
        for (int fila = 0; fila < bi.length; fila++)
        {
            for (int col = 0; col < bi[fila].length; col++)
            {
                System.out.print(" " + bi[fila][col] + " ");
            }
            System.out.println();
        }

        // Calcular diagonales
        int diagPrincipal = 0;
        int diagSecundaria = 0;

        for (int k = 0; k < bi.length; k++)
        {
            diagPrincipal += bi[k][k];
            diagSecundaria += bi[k][bi.length - 1 - k];
        }

        System.out.println();


        for (int col = 0; col < bi[0].length; col++)
        {
            System.out.print("    ");
        }
        System.out.printf("%6d%n", diagSecundaria);

        //suma de cada renglón a la derecha
        for (int fila = 0; fila < bi.length; fila++)
        {
            int sumaFila = 0;
            for (int col = 0; col < bi[fila].length; col++)
            {
                System.out.printf("%4d", bi[fila][col]);
                sumaFila += bi[fila][col];
            }
            System.out.printf("%6d%n", sumaFila);
        }
        //suma de cada columna y diagonal principal
        for (int col = 0; col < bi[0].length; col++)
        {
            int sumaCol = 0;
            for (int fila = 0; fila < bi.length; fila++)
            {
                sumaCol += bi[fila][col];
            }
            System.out.printf("%4d", sumaCol);
        }
        System.out.printf("%6d%n", diagPrincipal);

        //Suma de todos los numeros de la matriz
        int Suma = bi[0][0] + bi[0][1] + bi[1][0] + bi[1][1];
        System.out.println("Suma total: " + Suma);

        //Promedio
        double promedio = Suma / 4.0;
        System.out.println("Promedio: " + promedio);

        //Codigo de numero mayor y menor
        int mayor = bi[0][0];
        int menor = bi[0][0];

        for (int fila = 0; fila < bi.length; fila++) {
            for (int col = 0; col < bi[fila].length; col++) {
                if (bi[fila][col] > mayor) mayor = bi[fila][col];
                if (bi[fila][col] < menor) menor = bi[fila][col];
            }
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

    }
}


