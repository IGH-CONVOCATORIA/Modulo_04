package com.convocatoria.mod04;

import java.util.Random;

public class Problema01 {

  public static void main(String[] args) {
    Random random = new Random();
    int arrA[];
    int arrB[];
    int arrSuma[];

    arrA = new int[10];
    arrB = new int[10];
    arrSuma = new int[10];

    for (int i = 0; i < arrA.length; i++) {
      arrA[i] = random.nextInt(21) + 20;
    }
    for (int i = 0; i < arrA.length; i++) {
      arrB[i] = random.nextInt(21) + 20;
    }

    for (int i = 0; i < arrA.length; i++) {
      arrSuma[i] = arrA[i] + arrB[i];
    }

    System.out.print("Arreglo 1: ");
    for (int i = 0; i < arrA.length; i++) {
      System.out.print(arrA[i] + " ");
    }
    System.out.println();
    System.out.print("Arreglo 2: ");
    for (int i = 0; i < arrB.length; i++) {
      System.out.print(arrB[i] + " ");
    }
    System.out.println();
    System.out.print("El arreglo suma es:  ");
    for (int i = 0; i < arrSuma.length; i++) {
      System.out.print(arrSuma[i] + " ");
    }
    System.out.println();
  }
}
