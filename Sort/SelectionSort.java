package Sort;

class SelectionSorter {

    void sorter(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minId = i;
            for (int a = i + 1; a < n; a++) {
                if (arr[a] < arr[minId]) {
                    minId = a;
                }
            }
            int min = arr[minId];
            arr[minId] = arr[i];
            arr[i] = min;
        }
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
        SelectionSorter rez = new SelectionSorter();
        rez.sorter(arrNotSorted);
        rez.printSort(arrNotSorted);
    }

}
