public class ListAverage {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        //harmonik seri
        for (int j : list) sum += j;
        System.out.println("Harmonik seri: " + sum);
        System.out.println("Harmonik seri ortalaması: " + sum / list.length);
    }
}
