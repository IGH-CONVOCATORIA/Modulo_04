package com.convocatoria.mod04;

import java.util.Arrays;
import java.util.Random;

public class Problema03 {

  public static void main(String[] args) {
    int arr[];
    Random random = new Random();
    int cantidadPar, cantidadImpar;

    arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(31) + 20;
    }

    cantidadPar = 0;
    for (int i = 0; i < arr.length; i++) {
      if ((arr[i] % 2) == 0) {
        cantidadPar++;
      }
    }
    cantidadImpar = arr.length - cantidadPar;

    System.out.println(Arrays.toString(arr));
    System.out.println("La cantidad de numeros pares: " + cantidadPar);
    System.out.println("La cantidad de numeros impares: " + cantidadImpar);
  }
}
