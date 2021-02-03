package com.convocatoria.mod04;

import java.util.Arrays;
import java.util.Random;

public class Problema02 {

  public static void main(String[] args) {
    Random random = new Random();
    int notas[];
    int suma;
    double promedio;

    notas = new int[6];
    for (int i = 0; i < notas.length; i++) {
      notas[i] = random.nextInt(21);
    }

    Arrays.sort(notas);
    suma = 0;
    for (int i = 2; i < notas.length; i++) {
      suma = notas[i] + suma;
    }
    promedio = suma / (notas.length - 2);

    System.out.println(Arrays.toString(notas));
    System.out.println("El promedio de las 4 mayores notas es: " + promedio);
  }
}
