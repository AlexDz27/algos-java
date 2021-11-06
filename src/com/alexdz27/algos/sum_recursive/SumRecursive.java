package com.alexdz27.algos.sum_recursive;

import java.util.ArrayList;
import java.util.Arrays;

public class SumRecursive {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 0));

    System.out.println(sum(numbers));
  }

  public static int sum(ArrayList<Integer> numbers) {
    if (numbers.size() == 2) return numbers.get(0) + numbers.get(1);

    int lastNumber = numbers.remove(numbers.size() - 1);

    return lastNumber + sum(numbers);
  }
}
