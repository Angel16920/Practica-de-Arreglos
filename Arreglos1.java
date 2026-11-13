package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class Arreglos1
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        System.out.println("Ingrese cinco numeros: ");
            for(i = 0; i < 5; i++){
            arr[i] =sc.nextInt();
            }

        System.out.println("Al reves:");
        for (int k = 4; k >= 0; k--) {
            System.out.println(arr[k]);
        }

        int suma = 0;
        for (int z = 0; z < 5; z++) {
            suma += arr[z];
        }
        System.out.println("Total: " + suma);

       int promedio = suma/5;
        System.out.println("Promedio: " + promedio);

        int mayor = arr[0];
        int menor = arr[0];

        for (int w = 1; w < 5; w++) {
            if (arr[w] > mayor) mayor = arr[w];
            if (arr[w] < menor) menor = arr[w];
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        //mayor
        //menor


    }
}
