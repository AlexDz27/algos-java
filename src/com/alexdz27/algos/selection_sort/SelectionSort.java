package com.alexdz27.algos.selection_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(9, 4, 11, 55, 8, 6, 100, 1, 12));

    ArrayList<Integer> numbersSorted = new ArrayList<>();

    while (numbers.size() != 0) {
      int biggestNumberIndex = findBiggestNumberIndex(numbers);
      int biggestNumber = numbers.remove(biggestNumberIndex);

      numbersSorted.add(biggestNumber);
    }

    System.out.println(numbersSorted);
  }

  public static int findBiggestNumberIndex(ArrayList<Integer> numbers) {
    int pivotIndex = 0;
    int pivotNumber = numbers.get(pivotIndex);

    for (int i = 1; i < numbers.size(); i++) {
      int comparedNumber = numbers.get(i);

      if (pivotNumber < comparedNumber) {
        pivotNumber = comparedNumber;

        pivotIndex = i;
      }
    }

    return pivotIndex;
  }
}
