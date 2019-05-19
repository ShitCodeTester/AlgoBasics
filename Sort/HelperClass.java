package Sort;

public class HelperClass {

    int[] swapElements(int first, int second, int[] arr) {
        int firstElement = arr[first];
        int secondElement = arr[second];
        arr[first] = secondElement;
        arr[second] = firstElement;
        return arr;
    }

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        HelperClass helper = new HelperClass();
        helper.printArray(arr);
        helper.swapElements(10, 19, arr);
        helper.printArray(arr);
    }
}
