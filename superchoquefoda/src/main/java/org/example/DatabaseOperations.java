package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOperations {
    public static List<DadosPlanilha> consultarDados() {
        List<DadosPlanilha> dadosList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        String query = "SELECT * FROM planilha";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                // Processar os resultados conforme necessário
                int id = resultSet.getInt("id");
                String material = resultSet.getString("material");
                float valor = resultSet.getFloat("valor_unidade");


                // Criar um objeto DadosPlanilha e adicioná-lo à lista
                DadosPlanilha dados = new DadosPlanilha(id, material, valor );
                dadosList.add(dados);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dadosList;
    }
}
