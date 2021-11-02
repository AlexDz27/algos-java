package com.alexdz27.algos.factorial;

public class Factorial {
  public static void main(String[] args) {
    int result = factorial(5);

    System.out.println(result);
  }

  public static int factorial(int number) {
    if (number == 1) return number;

    return number * factorial(number - 1);
  }
}
