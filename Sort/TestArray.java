import java.util.HashMap;
import java.util.Map;

public class TestArray {

    void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
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

    void timeOfWorkOfArray(TestArray arg, int[] arr, Map<String, String> ourMapik) {
        long st = System.nanoTime();
        arg.printArr(arg.bubbleSort(arr));
        long en = System.nanoTime();
        long resultTime = en - st;
        System.out.println(resultTime);
        System.out.println(" ");
        ourMapik.put(String.valueOf(resultTime), arr.getClass().toString());
    }

    public static void main(String[] args) {
        Map<String, String> ourMap = new HashMap<>();
        TestArray testArr = new TestArray();
        int[] arrTest = testArr.createArray();
        int[] arrayForBubble = arrTest.clone();
        int[] arrayForSelect = arrTest.clone();
        int[] arrayForInsert = arrTest.clone();
        testArr.printArr(arrTest);
        testArr.printArr(arrayForBubble);
        testArr.printArr(arrayForSelect);
        testArr.printArr(arrayForInsert);
        System.out.println(" ");
        testArr.timeOfWorkOfArray(testArr, arrayForBubble,ourMap);
        testArr.timeOfWorkOfArray(testArr, arrayForSelect,ourMap);
        testArr.timeOfWorkOfArray(testArr, arrayForInsert,ourMap);
for(HashMap.Entry<String,String> item: ourMap.entrySet()){

    System.out.println(item.getKey()+ item.getValue());
}

    }

}
