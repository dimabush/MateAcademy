package homework.third;

public class MergeSort {
  public static int[] mergeArrays(int[] firstArr, int[] secondArr) {
    int[] finalArr = new int[firstArr.length + secondArr.length];
    int i = 0, j = 0, k = 0;
    while (i < firstArr.length && j < secondArr.length) {
      if (firstArr[i] < secondArr[j]) {
        finalArr[k] = firstArr[i];
        i++;
      } else {
        finalArr[k] = secondArr[j];
        j++;
      }
      k++;
    }
    while (i < firstArr.length){
      finalArr[k] = firstArr[i];
      i++;
      k++;
    }
    while (j < secondArr.length){
      finalArr[k] = secondArr[j];
      j++;
      k++;
    }
      return finalArr;
  }
}
