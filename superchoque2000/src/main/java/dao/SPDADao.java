package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import Modelo.SpdaModelo;

public class SPDADao {
    private static final String SELECT_SQL = "SELECT material, valor_unidade FROM planilha WHERE id = ?";

    public SpdaModelo obterPorId(int id) throws SQLException {
        SpdaModelo planilha = new SpdaModelo();

        try (Connection conn = ConexaoBanco.abreConexao();
             PreparedStatement preparedStatement = conn.prepareStatement(SELECT_SQL)) {

            preparedStatement.setInt(1, id);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                planilha.popularDados(rs);
            }
        }

        return planilha;
    }
}
