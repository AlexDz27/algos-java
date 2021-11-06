package com.alexdz27.algos.count_elements_in_list;

import java.util.ArrayList;
import java.util.Arrays;

public class CountElementsInList {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("qwe", "asd", "fdsfsdf", "cxvjkcjk"));

    System.out.println(countElementsInList(list));
  }

  public static int countElementsInList(ArrayList<String> list) {
    if (list.size() == 0) return 0;

    list.remove(list.size() - 1);

    return 1 + countElementsInList(list);
  }
}
