package com.alexdz27.algos.binary_search;

public class BinarySearchRecursive {
  public static void main(String[] args) {
    int[] array = new int[]{5, 8, 10, 15, 20, 23, 45};
    int[] array2 = new int[]{10, 12, 15, 27, 30, 100};
    int[] array3 = new int[]{1, 12, 15, 27, 30, 100};

//    System.out.println(binarySearch(5, array, 0, array.length - 1));
//    System.out.println(binarySearch(8, array, 0, array.length - 1));
//    System.out.println(binarySearch(10, array, 0, array.length - 1));
//    System.out.println(binarySearch(15, array, 0, array.length - 1));
//    System.out.println(binarySearch(20, array, 0, array.length - 1));
//    System.out.println(binarySearch(23, array, 0, array.length - 1));
//    System.out.println(binarySearch(45, array, 0, array.length - 1));

//    System.out.println(binarySearch(10, array2, 0, array2.length - 1));
//    System.out.println(binarySearch(12, array2, 0, array2.length - 1));
//    System.out.println(binarySearch(15, array2, 0, array2.length - 1));
//    System.out.println(binarySearch(27, array2, 0, array2.length - 1));
//    System.out.println(binarySearch(30, array2, 0, array2.length - 1));
//    System.out.println(binarySearch(100, array2, 0, array2.length - 1));

    System.out.println(binarySearch(28, array2, 0, array2.length - 1));
//    System.out.println(binarySearch(0, array3, 0, array.length - 1));
  }

  public static int binarySearch(int number, int[] array, int leftBoundary, int rightBoundary) {
    int middleIndex;
    try {
      middleIndex = findMiddleIndexInIndicesRange(leftBoundary, rightBoundary);
    } catch (Exception exception) {
      return -1;
    }
    int middleNumber = array[middleIndex];

    if (middleNumber == number) return middleIndex;

    if (middleNumber > number) {
      return binarySearch(number, array, leftBoundary, middleIndex - 1);
    }

    if (middleNumber < number) {
      return binarySearch(number, array, middleIndex + 1, rightBoundary);
    }

    return -1;
  }

  public static int findMiddleIndexInIndicesRange(int leftBoundary, int rightBoundary) throws Exception {
    if (leftBoundary > rightBoundary || rightBoundary < leftBoundary) throw new Exception("Got range invalid");

    return (int) Math.floor((rightBoundary + leftBoundary) / 2);
  }
}
