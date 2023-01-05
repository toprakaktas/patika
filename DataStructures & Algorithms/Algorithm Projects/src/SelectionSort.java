public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,3,5,8,2,9,4,15,6};

        System.out.print("Selection sort öncesi dizi: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        selection(arr);

        System.out.print("Selection sort sonrası dizi: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

    static void selection(int[] arr){
        int small;
        for (int i = 0; i < (arr.length-1); i++) { //n
            small = i;

            for (int j = i + 1; j < (arr.length); j++) { //n
                if (arr[j] < arr[small])
                    small = j;
            }

            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    } //O(n^2)
}