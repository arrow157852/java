import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String list1 = scanner.nextLine();
        String list2 = scanner.nextLine();

        String[] string1 = list1.split(" ");
        String[] string2 = list2.split(" ");

        BigDecimal codigo1 = new BigDecimal(string1[0]);
        BigDecimal numPeca1= new BigDecimal(string1[1]);
        BigDecimal valor1= new BigDecimal(string1[2]);
        
        BigDecimal codigo2 = new BigDecimal(string2[0]);
        BigDecimal numPeca2= new BigDecimal(string2[1]);
        BigDecimal valor2= new BigDecimal(string2[2]);

        BigDecimal somar = numPeca1.multiply(valor1).add(numPeca2.multiply(valor2));

        System.out.println( new DecimalFormat("Valor A PAGAR : R$ ###0.00").format(somar) );
    }
}

