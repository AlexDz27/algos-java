package com.alexdz27.algos.quick_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(3, 6, 5, 2, 18, -15, 33, 100, 4, 101));

    System.out.println(quickSort(myList));
  }

  public static ArrayList<Integer> quickSort(ArrayList<Integer> list) {
    if (list.size() <= 1) return list;

    if (list.size() == 2) {
      int firstItem = list.get(0);
      int secondItem = list.get(1);

      if (secondItem < firstItem) {
        list.set(0, secondItem);
        list.set(1, firstItem);
      }

      return list;
    }

    int pivotItem = list.remove(0);

    ArrayList<ArrayList<Integer>> settleResult = settle(list, pivotItem);

    ArrayList<Integer> leftList = quickSort(settleResult.get(0));
    ArrayList<Integer> rightList = quickSort(settleResult.get(1));

    return glue(leftList, pivotItem, rightList);
  }

  public static ArrayList<ArrayList<Integer>> settle(ArrayList<Integer> list, int pivotItem) {
    ArrayList<Integer> leftList = new ArrayList<>();
    ArrayList<Integer> rightList = new ArrayList<>();

    for (int number : list) {
      if (number < pivotItem) {
        leftList.add(number);
      } else {
        rightList.add(number);
      }
    }

    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    result.add(leftList);
    result.add(rightList);

    return result;
  }

  public static ArrayList<Integer> glue(ArrayList<Integer> leftList, int item, ArrayList<Integer> rightList) {
    ArrayList<Integer> intermediate = new ArrayList<>(Arrays.asList(item));

    leftList.addAll(intermediate);
    leftList.addAll(rightList);

    return leftList;
  }
}
