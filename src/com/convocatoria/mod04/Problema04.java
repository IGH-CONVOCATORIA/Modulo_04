package com.convocatoria.mod04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problema04 {

  public static void main(String[] args) {
    int numeros[];
    double media, mediana;
    double suma;
    int n;
    Scanner reader = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Ingrese tamaño del arreglo: ");
    n = reader.nextInt();

    numeros = new int[n];
    for (int i = 0; i < n; i++) {
      numeros[i] = random.nextInt(21) + 10;
    }

    Arrays.sort(numeros);
    suma = 0;
    if ((n % 2) == 0) {
      mediana = (numeros[n / 2] + numeros[(n / 2) - 1]) / 2;
    } else {
      mediana = numeros[n / 2];
    }
    for (int i = 0; i < n; i++) {
      suma = numeros[i] + suma;
    }
    media = suma / 2;

    System.out.println(Arrays.toString(numeros));
    System.out.println("La mediana es: " + mediana);
    System.out.println("La media es: " + media);
  }
}
