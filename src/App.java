public class App {
  public static void main(String[] args) {
    int[] array = new int[]{5, 8, 10, 15, 20, 23, 45};

    System.out.println(binarySearch(8, array));
  }

  public static int binarySearch(int number, int[] array) {
    int pivotIndex = getMiddleIndexOfArray(array);
    int pivotNumber = array[pivotIndex];

    if (pivotNumber == number) return pivotIndex;

    return binarySearch(number, new int[]{5, 8, 10});
  }

  public static int getMiddleIndexOfArray(int[] array) {
    double middleIndexAfterDivision = array.length / 2.0;

    return (int) Math.ceil(middleIndexAfterDivision) - 1;
  }
}
