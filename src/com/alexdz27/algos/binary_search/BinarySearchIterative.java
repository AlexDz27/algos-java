package com.alexdz27.algos.binary_search;

public class BinarySearchIterative {
  public static void main(String[] args) {
    int[] array = new int[]{5, 8, 10, 15, 20, 23, 45};
    int[] array2 = new int[]{1, 3, 5, 7, 9};

//    System.out.println(binarySearch(5, array));
//    System.out.println(binarySearch(8, array));
//    System.out.println(binarySearch(10, array));
//    System.out.println(binarySearch(15, array));
//    System.out.println(binarySearch(20, array));
//    System.out.println(binarySearch(23, array));
//    System.out.println(binarySearch(45, array));

//    System.out.println(binarySearch(50, array));
//    System.out.println(binarySearch(48, array));
//    System.out.println(binarySearch(25, array));

    System.out.println(binarySearch(1, array2));
    System.out.println(binarySearch(3, array2));
    System.out.println(binarySearch(5, array2));
    System.out.println(binarySearch(7, array2));
    System.out.println(binarySearch(9, array2));
    System.out.println(binarySearch(-1, array2));
  }

  public static int binarySearch(int number, int[] array) {
    int leftBoundary = 0;
    int rightBoundary = array.length - 1;

    while (true) {
      int middleIndex;
      try {
        middleIndex = findMiddleIndexInIndicesRange(leftBoundary, rightBoundary);
      } catch (Exception exception) {
        return -1;
      }
      int middleNumber = array[middleIndex];

      if (middleNumber == number) return middleIndex;

      if (middleNumber > number) {
        rightBoundary = middleIndex - 1;
      }
      
      if (middleNumber < number) {
        leftBoundary = middleIndex + 1;
      }
    }
  }

  public static int findMiddleIndexInIndicesRange(int leftBoundary, int rightBoundary) throws Exception {
    if (leftBoundary > rightBoundary || rightBoundary < leftBoundary) throw new Exception("Got range invalid");

    return (int) Math.floor((rightBoundary + leftBoundary) / 2);
  }
}
