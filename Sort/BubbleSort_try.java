package Sort;

public class BubbleSort_try {

    public static void main(String[] args) {
        int[] arr = new int[20];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*50);
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int g = 0; g < i; g++) {
                if (arr[g] > arr[g + 1]) {
                    int min = arr[g + 1];
                    arr[g + 1] = arr[g];
                    int min_i = g;
                    arr[g] = min;
                }
            }
        }
        
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    
}
