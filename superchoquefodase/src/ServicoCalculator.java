import java.sql.ResultSet;
import java.sql.SQLException;

public class ServicoCalculator {

    public static double calcularServico(ResultSet resultSet) {
        try {
            // Suponha que o resultado contenha uma coluna chamada "valor" que representa o valor do serviço
            double valorDoServico = resultSet.getDouble("valor");

            // Realize qualquer lógica de cálculo necessário
            // Vamos simplesmente dobrar o valor do serviço neste exemplo
            double resultado = valorDoServico * 2;

            return resultado;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao calcular o serviço: " + e.getMessage());
            return 0.0; // ou outro valor padrão, dependendo do seu caso
        }
    }


}
