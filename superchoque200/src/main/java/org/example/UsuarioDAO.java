package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO() {
        this.conn = Database.getConnection();
    }

    public void salvar(UsuarioDAO usuario) {
        String sql = "SELECT material, valor_unitario FROM planilha WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            // Process the result set, assuming it has two columns: material and valor_unitario
            while (rs.next()) {
                String material = rs.getString("material");
                double valorUnitario = rs.getDouble("valor_unitario");

                // Do something with the retrieved data, e.g., print or store it
                System.out.println("Material: " + material + ", Valor Unitario: " + valorUnitario);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro ao salvar o usuário: " + e.getMessage());
        }
    }
}
