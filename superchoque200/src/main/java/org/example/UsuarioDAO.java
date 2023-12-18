package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO() {
        this.conn = Database.getConnection();
    }

    public void salvar(Dao usuario) {
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro ao salvar o usuário: " + e.getMessage());
        }
    }
}
