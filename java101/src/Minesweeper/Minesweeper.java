package Minesweeper;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    int row, col, mine;
    String[][] gameField;
    String[][] mineField;

    Minesweeper(int row, int col){
        this.row = row;
        this.col = col;
        this.gameField = new String[row][col];
        this.mineField = new String[row][col];
        this.mine = (row * col) / 4; //boyutun çeyreği kadar mayın olacak
    }

    //oyun alanını oluşturan metot
    public void setField(){
        Random rnd = new Random();
        int rndR, rndC; //random satır ve sütun sayıları atanacak

        //mayınların bulunduğu alanları * ile işaretle
        for (int i = 0; i < mine; i++){
            rndR = rnd.nextInt(row);
            rndC = rnd.nextInt(col);

            if (!Objects.equals(mineField[rndR][rndC], "*"))
                mineField[rndR][rndC] = "*";
            else
                i--;
        }

        //mayınların olmadığı bölgeleri - ile işaretle
        for(int j = 0; j < row; j++){
            for (int k = 0; k < col; k++){
                gameField[j][k] = "-";
                if (!Objects.equals(mineField[j][k], "*"))
                    mineField[j][k] = "-";
            }
        }
    }

    public void printMineField(){
        for (int i = 0; i < row; i++){
            for (int j= 0; j < col; j++)
                System.out.print(mineField[i][j] + " ");
            System.out.println();
        }
        System.out.println("==============================");
    }


    public void play() {
        Scanner sc = new Scanner(System.in);
        int row, col;
        int move = (this.row * this.col) - this.mine;

        System.out.println("Mayınların Konumu");
        setField();
        printMineField();
        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz!");


        while (move > 0) {
            System.out.print("Satır giriniz: ");
            row = sc.nextInt();
            System.out.print("Sütun giriniz: ");
            col = sc.nextInt();

            if ((row < 0 || row >= this.row) || (col < 0 || col >= this.col)) {
                System.out.println("Hatalı giriş yaptınız indis numarasını tekrar giriniz!");
                continue;
            }
            if (mineField[row][col].equals("*")) {
                System.out.println("Game Over!!!");
                break;
            } else {
                if (!this.mineField[row][col].equals("-"))
                    System.out.println("Bu hamleyi zaten yaptınız!");
                else {
                    int point = 0;
                    int belowRow = (row - 1), aboveRow = (row + 1);
                    int belowCol = (col - 1), aboveCol = (col + 1);

                    if (belowRow < 0) {
                        belowRow = 0;
                    }
                    if (belowCol < 0) {
                        belowCol = 0;
                    }
                    if (aboveRow >= row) {
                        aboveRow = row;
                    }
                    if (aboveCol >= col) {
                        aboveCol = col;
                    }

                    for (int i = belowRow; i <= aboveRow; i++) {
                        for (int j = belowCol; j <= aboveCol; j++) {
                            if (this.mineField[i][j].equals("*"))
                                point++;
                        }
                    }

                    String pointCnt = Integer.toString(point);
                    this.gameField[row][col] = pointCnt;
                    move--;

                    for (String[] strings : gameField) {
                        for (String string : strings) System.out.print(string);
                        System.out.println();
                    }
                    System.out.println("==============================");
                }
            }
        }
        if (move == 0)
            System.out.println("Oyunu Kazandınız!");
    }
}
