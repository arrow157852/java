package org.example;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

    private String material;
    private float valorUnidade;

    public Dao() {
        new Database();
    }

    public void realizarConsulta(int id) {
        String sql = "SELECT material, valor_unidade FROM planilha WHERE id = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {

            // Define o valor do parâmetro
            preparedStatement.setInt(1, id);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    // Define os valores dos campos
                    this.setMaterial(rs.getString("material"));
                    this.setValorUnidade(rs.getFloat("valor_unidade"));
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro durante a consulta: " + e.getMessage());
        }
    }

    // Getter para material
    public String getMaterial() {
        return material;
    }

    // Setter para material
    public void setMaterial(String material) {
        this.material = material;
    }

    // Getter para valorUnidade
    public float getValorUnidade() {
        return valorUnidade;
    }

    // Setter para valorUnidade
    public void setValorUnidade(float valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    // Método para obter o valor do material
    public String obterNomeMaterial(int id) {
        realizarConsulta(id);
        return getMaterial();
    }

    // Método para obter o valor da unidade
    public float obterValorUnidade(int id) {
        realizarConsulta(id);
        return getValorUnidade();
    }
}

