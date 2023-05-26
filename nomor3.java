
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password2 = input.nextLine();
        boolean validPassword1 = isValidPassword(password2);
        // No upper case
        System.out.println(validPassword1);
    }
     public static boolean isValidPassword(String password)
    {
            boolean isValid = true;
            if ( password.length() < 8)
            {
                    System.out.println("Kata sandi minimal 8 karakter");
                    isValid = false;
            }
              if (password.length() > 32 || password.length() < 8)
            {
                    System.out.println("Kata sandi maksimal 32 karakter");
                    isValid = false;
            }
             char firstChar = password.charAt(0);
             if (Character.isDigit(firstChar)) {
             System.out.println("Karakter awal tidak boleh angka");
                    isValid = false;
               }   
                String numbers = "(.*[0-9].*)";
            if (!password.matches(numbers ))
            {
                    System.out.println("Harus memiliki angka");
                    isValid = false;
            }
            String upperLowerCaseChars = "(?=.*[A-Z])(?=.*[a-z]).*";
            if (!password.matches(upperLowerCaseChars ))
            {
                    System.out.println("Harus memiliki huruf kapital dan huruf kecil");
                    isValid = false;
            }
        
            return isValid; 
    }
}
