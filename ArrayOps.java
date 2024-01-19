public class ArrayOps {
    public static void main(String[] args) {


    }

    public static int findMissingInt(int[] array) {
        int n = array.length;

        // Calculate the expected sum of integers from 0 to n
        int expectedSum = (n * (n + 1)) / 2;

        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int i = 0; i < array.length; i++) {

            actualSum += array[i];

        }

        // The missing integer is the difference between expected and actual sum
        return expectedSum - actualSum;
    }


    public static int secondMaxValue(int[] array) {
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int count=0;
        for (int j = 0; j < array.length; j++) {
            if (array[j]==max) {
              count++;  
            }
            if (count==2) {
              return max;  
            }
            if (array[j] > secondMax&&array[j]<max ) {
                secondMax = array[j];
            }
        }
        return secondMax;
    }


    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        boolean isTheSame = true;
        for (int i = 0; i < array1.length; i++) {
            if (!isTheSame){
                return false;
            }
            isTheSame = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isTheSame = true;
                    break;
                }
            }

        }
        return isTheSame;
    }

    public static boolean isSorted(int[] array) {
        boolean increasing = array[0] < array[1];

        for (int i = 1; i < array.length; i++) {
            if (increasing && array[i - 1] > array[i]) {
                return false; // Array is not sorted in increasing order
            } else if (!increasing && array[i - 1] < array[i]) {
                return false; // Array is not sorted in decreasing order
            }
        }

        return true; // Array is sorted
    }

}
