package Sort;

class InsertionSort {

    int[] sorter(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int a = i + 1; a > 0; a--) {
                if (arr[a] < arr[a - 1]) {
                    int max = arr[a - 1];
                    arr[a - 1] = arr[a];
                    arr[a] = max;
                }
            }
        }
        return arr;
    }

    void printSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrNotSorted = new int[10];
        for (int i = 0; i < arrNotSorted.length; i++) {
            arrNotSorted[i] = (int) (Math.random() * 100);
        }
        InsertionSort ins = new InsertionSort();
        ins.sorter(arrNotSorted);
        ins.printSort(arrNotSorted);
    }
}
