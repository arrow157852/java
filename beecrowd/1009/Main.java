import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();

        String numero2 = scanner.nextLine();
        BigDecimal salarioFixo = new BigDecimal(numero2);

        String numero3 = scanner.nextLine();
        BigDecimal vendaBruta = new BigDecimal(numero3);
        BigDecimal percentualComissao = new BigDecimal("0.15"); // Usando uma string para evitar imprecisões de conversão
        BigDecimal valor_a_Receber = vendaBruta.multiply(percentualComissao).add(salarioFixo);

        // Arredondamento
        int scale = 2;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        valor_a_Receber = valor_a_Receber.setScale(scale, roundingMode);

        // Formatar e imprimir o resultado
        DecimalFormat decimalFormat = new DecimalFormat("TOTAL = R$ ###0.00");
        String resultadoFormatado = decimalFormat.format(valor_a_Receber);
        System.out.println(resultadoFormatado);
    }
}
