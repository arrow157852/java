import java.math.BigDecimal;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);

        String numero1  = scanner.nextLine();
        BigDecimal numero= new BigDecimal(numero1);
       
        String numero2  = scanner.nextLine();
        BigDecimal hr_trabalhada= new BigDecimal(numero2);
        
        String numero3 = scanner.nextLine();
        BigDecimal hr_homem= new BigDecimal(numero3);
        BigDecimal valor_a_Receber= hr_homem.multiply(hr_trabalhada);
        
        System.out.println("NUMBER = "+numero);
        System.out.println( new DecimalFormat("Salary = U$ ###0.00").format(valor_a_Receber) );
    }
}
