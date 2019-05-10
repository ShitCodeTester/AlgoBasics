public class TestArray {

    void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    int[] createArray() {
        int[] genereatedArray = new int[20];
        for (int i = 0; i < genereatedArray.length; i++) {
            genereatedArray[i] = (int) (Math.random() * 1000);
        }
        return genereatedArray;
    }

    int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int n = 0; n < i; n++) {
                if (arr[n] > arr[n + 1]) {
                    int max = arr[n];
                    arr[n] = arr[n + 1];
                    arr[n + 1] = max;
                }
            }
        }
        return arr;
    }

    int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int id_min = i;
            for (int m = i + 1; m < arr.length; m++) {
                if (arr[id_min] > arr[m]) {
                    id_min = m;
                }
                int min = arr[id_min];
                arr[id_min] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }

    int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int a = i + 1; a < arr.length; a--) {
                if (arr[a] < arr[a - 1]) {
                    int min = arr[a];
                    arr[a] = arr[a - 1];
                    arr[a - 1] = min;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        TestArray testArr = new TestArray();
        int[] arrTest = testArr.createArray();
        testArr.printArr(arrTest);

    }
}
