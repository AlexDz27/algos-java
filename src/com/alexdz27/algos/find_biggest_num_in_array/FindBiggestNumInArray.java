package com.alexdz27.algos.find_biggest_num_in_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindBiggestNumInArray {
  public static void main(String[] args) {
    System.out.println(findBiggestNumber4(new ArrayList<>(Arrays.asList(100, 2, 3, 12, 4, 8))));
  }

  // Simple preserving and reducing
  public static int findBiggestNumber4(List<Integer> list) {
    if (list.size() == 2) {
      int left = list.get(0);
      int right = list.get(1);

      if (left < right) {
        return right;
      } else {
        return left;
      }
    }

    int removed = list.remove(list.size() - 1);
    int subMax = findBiggestNumber4(list.subList(0, list.size()));

    return findBiggestNumber4(Arrays.asList(removed, subMax));
  }

  // Cutting list in two halfs
  public static int findBiggestNumber3(List<Integer> list) {
    if (list.size() == 1) return list.get(0);

    if (list.size() == 2) {
      int left = list.get(0);
      int right = list.get(1);

      if (left < right) {
        return right;
      } else {
        return left;
      }
    }

    int n = (int) Math.floor(list.size() / 2);
    List<Integer> leftList = list.subList(0, n);
    List<Integer> rightList = list.subList(n, list.size());

    int leftPartResult = findBiggestNumber3(leftList);
    int rightPartResult = findBiggestNumber3(rightList);

    return findBiggestNumber3(new ArrayList<>(Arrays.asList(leftPartResult, rightPartResult)));
  }
}
