import java.util.Arrays;
public class ArrayFrequency {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        int counter = 0, temp = list[0];

        System.out.println("==== Tekrar sayıları ====");
        for (int i = 0; i < list.length; i++){
            if (i == 0 || temp != list[i]){
                for (int j : list){
                    if (j == list[i]){
                        counter++;
                        temp = list[i];
                    }
                }
                System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            counter = 0;
        }
    }
}


/*
        Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
        Tekrar Sayıları
        10 sayısı 3 kere tekrar edildi.
        20 sayısı 4 kere tekrar edildi.
        5 sayısı 1 kere tekrar edildi.

 */