import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite seu nome:");
            var nome = sc.nextLine();
            
            System.out.println("Digite sua idade:");
            var idade = sc.nextInt();
    
            System.out.println("Me chamo " + nome + ", tenho " + idade + " anos.");
        } catch(InputMismatchException e) {
            System.out.println("Campo idade precisa ser numérico.");
        }
        sc.close();
    }
}
