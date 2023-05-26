
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
        System.out.print("Masukkan INPUT POLA: ");
        int nilai = input.nextInt();
        
        
        if (nilai%2==0){
            System.out.print("Harus bilangan ganjil");
        }else{
             char[][] pattern = new char[nilai][nilai];
            for (int i = 0; i < nilai; i++) {
            for (int j = 0; j < nilai; j++) {
                if (i == 0 || i == nilai - 1 || j == 0 || j == nilai - 1 || i == j || i == nilai - j - 1) {
                    pattern[i][j] = 'X';
                } else {
                    pattern[i][j] = 'O';
                }
            }
        }

        for (int i = 0; i < nilai; i++) {
            for (int j = 0; j < nilai; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }

    }
    }
}
