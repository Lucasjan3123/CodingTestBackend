
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
       
        
        String output =  Kelipatancacah(N);
        System.out.println(output);
    }
    
    public static String  Kelipatancacah(int N) {
        int count = 0;
        StringBuilder a = new StringBuilder();
        
        for (int i = 1; count < N; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                a.append("Z ");
                count++;
            } else if (i % 3 == 0 || i % 7 == 0) {
                a.append(i).append(" ");
                count++;
            }
        }
        
        return a.toString().trim();
    }
}
