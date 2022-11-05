public class Prime {
    public static void main(String[] args) {
        int number = 100;
        boolean flag;

        for (int i = 1; i <= number; i++){
            if (i == 1) continue;
            flag = true;

            for (int j = 2; j <= i/2; j++){
                if (i%j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(i + " ");
        }
    }
}
